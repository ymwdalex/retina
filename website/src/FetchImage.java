/*
 *	When user change the output mode (encircle image, or just system output), the thresholding
 *	or just change a binary image, this servlet is called and generate the image in the server
 *	Zhe Sun
 */

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileFilter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import javax.imageio.ImageIO;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.filefilter.WildcardFileFilter;

import retina.COSFIRE;

import com.mathworks.toolbox.javabuilder.MWClassID;
import com.mathworks.toolbox.javabuilder.MWComplexity;
import com.mathworks.toolbox.javabuilder.MWException;
import com.mathworks.toolbox.javabuilder.MWNumericArray;

/**
 * Servlet implementation class FetchImage
 */
@WebServlet("/FetchImage")
public class FetchImage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchImage() {
        super();
    }

	String CurrentPath;
	public void init(final ServletConfig config) {
		CurrentPath = config.getServletContext().getRealPath("/");
        //System.out.println(CurrentPath);
    }
    
	protected BufferedImage getCOSFIRE(int[][] maxGrayScale, int w, int h, boolean blackBackground){
		BufferedImage imgOut = new BufferedImage(w,h,BufferedImage.TYPE_BYTE_GRAY); 
		int grayValue;
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++){
				if (blackBackground){
					grayValue = maxGrayScale[i][j] + (maxGrayScale[i][j] << 8) + (maxGrayScale[i][j] << 16) + 0xFF000000;
				} else {
					int invertGrayScale = 255 - maxGrayScale[i][j];
					grayValue = invertGrayScale + (invertGrayScale << 8) + (invertGrayScale << 16) + 0xFF000000;
				}
				imgOut.setRGB(i, j, grayValue);
			}
		}	
		return imgOut;
	}

	protected BufferedImage getLocalMax(int[][] maxGrayScale, int w, int h, boolean blackBackground){
		BufferedImage imgOut = new BufferedImage(w,h,BufferedImage.TYPE_BYTE_GRAY);
		// local Maximum, black or white
		int grayValue;
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++){
				if (maxGrayScale[i][j] > 0){
					grayValue = 0xFFFFFFFF;	
				} else {
					grayValue = 0xFF000000;
				}
				if (!blackBackground){
					grayValue ^= 0xFFFFFF; 
				}
				imgOut.setRGB(i, j, grayValue);
			}
		}
		return imgOut;
	}

	protected BufferedImage getCircle(int[][] maxGrayScale, int cutoff, int w, int h,  String baseName, String outputFolder) {
		String inputName = SystemParam.path.binaryInputFolder + baseName + ".gif";
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(CurrentPath + inputName));
		} catch (IOException e) {
			System.out.println("Read file [" + CurrentPath + inputName + "] error");
		}		
		
		// get the number of local maximum response
		int row = 0;
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++){
				if (maxGrayScale[i][j] > 0){
					row++;
				}
			}
		}			

		// initial matrix
		int[] dimInput = {row, 2};
		MWNumericArray coorMatlab = null;
		coorMatlab = MWNumericArray.newInstance(dimInput,MWClassID.DOUBLE, MWComplexity.REAL);
		
		// also transmit response value to Matlab code
		int[] dimInput2 = {row, 1}; // for responseMatlab
		MWNumericArray responseMatlab = null;
		responseMatlab = MWNumericArray.newInstance(dimInput2,MWClassID.DOUBLE, MWComplexity.REAL);
		
		// write coordinate to input arguments
		int[] index = {1,1};
		int[] index2 = {1,1}; // for responseMatlab
		row = 0;
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++){
				if (maxGrayScale[i][j] > 0){
					row++;
					// set x
					index[0] = row; index[1] = 1;
					coorMatlab.set(index, j+1);
					// set y
					index[1] = 2;
					coorMatlab.set(index, i+1);
					
					index2[0] = row;
					responseMatlab.set(index2, maxGrayScale[i][j]);
				}
			}
		}		
		
		// call function
		COSFIRE matlabClass = null;
		try {
			matlabClass = new COSFIRE();
		} catch (MWException e1) {
			e1.printStackTrace();
		}
		Object[] result = null;    /* Stores the result */
		//int cutoff = 5;
		MWNumericArray inputCutOff = new MWNumericArray(cutoff, MWClassID.INT32);

		try {
			result =  matlabClass.pickBestCircle(1, (Object)coorMatlab, (Object)inputCutOff, (Object)responseMatlab);
		} catch (MWException e1) {
			e1.printStackTrace();
		}
		
		MWNumericArray newCoor = (MWNumericArray)result[0];
		int[] dimOutput = newCoor.getDimensions();
		int coorNum = dimOutput[0];
		int[][] coor = new int[coorNum][dimOutput[1]];
		
		// convert row/column to x/y (start with zero)
		for (int i=1; i<=coorNum; i++){
			for (int j=1; j<=dimOutput[1]; j++){
				index[0] = i; index[1] = j;
				coor[i-1][j-1] = newCoor.getInt(index);
			}
		}
		
		// copy from the groundtruth image
		BufferedImage imgOut = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		for (int i=0; i<w; i++){
			for (int j=0; j<h; j++){
				imgOut.setRGB(i, j, img.getRGB(i, j));
			}
		}
		
		// prepare coordinates strings
		String coordinates = "";
		
		// draw circle
		int radius = 15;
		Graphics2D g = (Graphics2D) imgOut.getGraphics(); 
		g.setColor(Color.RED);
		
		for (row =0; row<coorNum; row++){
			int i = coor[row][1]-1; int j = coor[row][0]-1; 
			coordinates += coor[row][0] + "," + coor[row][1] + "\n";
			// stroke width
			g.setStroke(new BasicStroke(2F));
			// attention to the parameters
			g.drawOval(i-radius, j-radius, radius*2, radius*2);			
		}

		// write to the image file
		Writer output = null;
		String txtFileName = outputFolder+ baseName + "_coordinate.txt";
		File file = new File(txtFileName);		
		try {
			output = new BufferedWriter(new FileWriter(file));
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			output.write(coordinates);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return imgOut;
	}	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Input arguments:
		// baseName: the filename of the image which will be processed
		// method: encircle image or system output
		// thresholding: threshold which control by the slider in GUI
		// InvertImg: used in system output, invert the black and white
		// timeStamp: when user visit the website, a timestamp is generated. Use the timestamp
		// 			  as the output folder name
		// randTag: append to output name, avoid cache in the browser.
		String baseName = request.getParameter("baseName").toString();
		int method = Integer.parseInt(request.getParameter("method"));
		float threshold = Float.parseFloat(request.getParameter("threshold"));
		boolean blackBackground = Boolean.parseBoolean(request.getParameter("invertImg"));
		String timeStamp = request.getParameter("timeStamp").toString();
		String randTag = request.getParameter("randTag").toString();
		
		// prepare the folder and filename
		String currFolder = CurrentPath + SystemParam.path.outputFolder + baseName + File.separator;

		// prepare the output image
		int dotPos = SystemParam.operators[0].name.lastIndexOf(".");
		String fileName = SystemParam.operators[0].name.substring(0, dotPos) + ".gif";
		// a fake read, just for the width and height
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File(currFolder + fileName));
		} catch (IOException e) {
			System.out.println("Read file [" + currFolder + fileName + "] error");
		}
		int w = img.getWidth();
		int h = img.getHeight();
		int[][] maxGrayScale = new int[w][h];

		// different method has different name
		String appendName = null;
		switch (method){
		case 1:
			// COSFIRE
			appendName = ".gif";
			break;
		case 2:
			// with circle
			appendName = "_localMax.gif";
			break;
		case 3:
			// localMax
			appendName = "_localMax.gif";
			break;
		}
		
		// UI pass a threshold value, scale the threshold to 0~maxResponse
		// when threshold is 0.5, it is the default threshold		
		int opNum =  SystemParam.operators.length;
		int opThresh[] = new int[opNum];
		for (int i=0; i<opNum; i++){
			Operator op = SystemParam.operators[i];

			// Find the maximum response of system response
			String responseName = "_localMax.gif";;
			fileName = op.name.substring(0, op.name.lastIndexOf(".")) + responseName;
			
			// read the operator response file 
			try {
				img = ImageIO.read(new File(currFolder + fileName));
			} catch (IOException e) {
				System.out.println("Read file [" + currFolder + fileName + "] error");
			}
			
			// find the maximum response for the operator
			int maxResp = 0, pixel, pixel1;
			for (int ii=0; ii<w; ii++){
				for (int jj=0; jj<h; jj++){
					pixel1 = img.getRGB(ii,jj);
					pixel = pixel1 & 0xff;
					if (pixel > maxResp){
						maxResp = pixel;
					}
				}
			}
			
			// Use it to scale the thresholding.
			float maxRespFloat = (float) maxResp / 255;
			// Scale to lowestThreshFactor*defaultT ~ maxResponse`
			// when threshold is 0.5, use the default threshold
			if (threshold >= 0.5){
				opThresh[i] = (int) ((op.threshold + 2 * (threshold - 0.5) * (maxRespFloat - op.threshold)) * 255);
			}else{
				double lowestThreshFactor = 0.75;
				opThresh[i] = (int)((op.threshold * lowestThreshFactor + (2 * (1-lowestThreshFactor) * op.threshold * threshold)) * 255);
			}
						
			//System.out.println("Op thresh [" + i + "]: " + opThresh[i]);
			// old way, drop it
			// opThresh[i] = (int)(op.threshold * threshold * 255 * 2);
		}
		
		// iterate every operator, threshold and get the global output in maxGrayScale
		for (int k=0; k<opNum; k++){
			Operator op = SystemParam.operators[k];
			fileName = op.name.substring(0, op.name.lastIndexOf(".")) + appendName;
			try {
				img = ImageIO.read(new File(currFolder + fileName));
			} catch (IOException e) {
				System.out.println("Read file [" + currFolder + fileName + "] error");
			}
			
			int pixel, pixel1;
			for (int i=0; i<w; i++){
				for (int j=0; j<h; j++){
					pixel1 = img.getRGB(i,j);
					pixel = pixel1 & 0xff;
					if (maxGrayScale[i][j] < pixel && pixel >= opThresh[k]) {
						maxGrayScale[i][j] = pixel; 
					}
				}
			}
		}
		
		// create folder for the user output
		String outputFolder = CurrentPath + SystemParam.path.outputFolder + timeStamp + File.separator;
		File folder = new File(outputFolder);
		folder.mkdir();
		
		BufferedImage imgOut = null;
		switch (method){
		case 1:
			// COSFIRE
			imgOut = getCOSFIRE(maxGrayScale, w, h, blackBackground);
			break;
		case 2:
			// with circle
//			imgOut = getCircle(maxGrayScale, (int)(threshold*12+4), w, h,  baseName, outputFolder);
			imgOut = getCircle(maxGrayScale, 15, w, h,  baseName, outputFolder);
			break;	
		case 3:
			imgOut = getLocalMax(maxGrayScale, w, h, blackBackground);
			break;
		}
		
		// delete old file
		FileFilter fileFilter = new WildcardFileFilter(baseName + "*.gif");
		File[] files = folder.listFiles(fileFilter);
		for (int i = 0; i < files.length; i++) {
			//System.out.println(files[i]);
			files[i].delete();			
		}
		
		// prepare output file name
		String outputFileName = outputFolder + baseName + "_" + randTag + ".gif";
		File outputfile = new File(outputFileName);
		ImageIO.write(imgOut, "gif", outputfile);
	}

}
