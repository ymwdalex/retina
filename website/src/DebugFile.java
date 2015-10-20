/*
 * This is just some debug code
 * Zhe Sun 
 */
//import java.awt.Graphics2D;
//import java.awt.image.*;
//import java.io.File;
import java.io.IOException;
//
//import javax.imageio.ImageIO;
//
//import retina.COSFIRE;
//
//import com.mathworks.toolbox.javabuilder.MWArray;
//import com.mathworks.toolbox.javabuilder.MWCharArray;
//import com.mathworks.toolbox.javabuilder.MWException;

public class DebugFile {
	public static void main(String [] args) throws IOException{
//		COSFIRE matlabClass = null;
//		try {
//			matlabClass = new COSFIRE();
//		} catch (MWException e) {
//			e.printStackTrace();
//		}
//
//		File directory = new File (".");
//		MWCharArray currPath = new MWCharArray(directory.getAbsolutePath());
//		System.out.println(directory.getAbsolutePath());
//		MWCharArray operatorName = null;
//		MWCharArray inputImg = null;
//		MWCharArray outputImg = null;
//
//		inputImg = new MWCharArray("21_training.gif");
//		outputImg = new MWCharArray("21_training.png");
//		operatorName = new MWCharArray("[96,426].mat");
//
//		try {
//			matlabClass.retina(currPath, inputImg, operatorName, outputImg);
//		} catch (MWException e) {
//			e.printStackTrace();
//		}		
//		File directory = new File (".");
//		
//		String inputFile = directory.getCanonicalPath() +  File.separator + 
//				"Dataset" + File.separator + "outputImg"+ File.separator +
//				"21_training" + File.separator + "[121,192].png";
//
//		BufferedImage img = null;
//		try {
//			img = ImageIO.read(new File(inputFile));
//		} catch (IOException e) {
//			System.out.println("Read file [" + inputFile + "] error");
//		}
//		
//		int w = img.getWidth();
//		int h = img.getHeight(null);
//
//		BufferedImage imgOut = new BufferedImage(w,h,BufferedImage.TYPE_BYTE_GRAY); 
//		
//		int threshold =128;
//		int pixel;
//
//		for (int i=0; i<w; i++){
//			for (int j=0; j<h; j++){
//				pixel = img.getRGB(i,j) & 0xff;
//				
//				if (pixel < threshold){
//					int grayValue = 0xff000000;
//					imgOut.setRGB(i, j, grayValue);
//				} else {
//					int grayValue = pixel + (pixel << 8) + (pixel << 16) + 0xFF000000;
//					imgOut.setRGB(i, j, grayValue);
//				}
//			}
//		}
//		
//		String outputFileName = directory.getCanonicalPath() +  File.separator + 
//		"Dataset" + File.separator + "outputImg"+ File.separator +
//		"21_training" + File.separator + "[121,192]__.png";
//		File outputfile = new File(outputFileName);
//		ImageIO.write(imgOut, "png", outputfile);
//	}
//		BufferedImage img = null;
//		try {
//			img = ImageIO.read(new File("D:\\MatServer\\Dataset\\outputImg\\21_manual1\\1.gif"));
//		} catch (IOException e) {
//			System.out.println("Read file error");
//		}
//	
//		int w = img.getWidth();
//		int h = img.getHeight();
//		for (int j=0; j<h; j++){
//			for (int i=0; i<w; i++){
//				int pixel1 = img.getRGB(i,j);
//				int pixel = pixel1 & 0xff;
//				if (pixel > 0){
////					System.out.println("WTF: why???");
//				}
//			}
//		}
//		
//		for (int j=0; j<16; j++){
//			for (int i=0; i<16; i++){
//				int pixel1 = img.getRGB(i,j);
//				int pixel = pixel1 & 0xff;
//				System.out.print(pixel + "\t");
//			}
//			System.out.println();
//		}
		
//		COSFIRE matlabClass = null;
//		try {
//			matlabClass = new COSFIRE();
//		} catch (MWException e) {
//			e.printStackTrace();
//		}
//		
//		int[] oldCoor = new int[5];
//
//		MWCharArray currPath = new MWCharArray("edrf");
//		MWArray C = new MWArray();
//
//		int rtv = 0;
//		try {
//			matlabClass.pickBestCircle();
//		} catch (MWException e) {
//			e.printStackTrace();
//			rtv = 1;
//		}
		
	}
}
