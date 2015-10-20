/*
 * This servlet is receiving the uploaded file
 * Zhe Sun
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.io.FilenameUtils;

import com.google.gson.Gson;

public class UploadBinaryServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	String CurrentPath;
	String absolutePath;
	public void init(final ServletConfig config) {
		CurrentPath = config.getServletContext().getRealPath("/");
		absolutePath = CurrentPath + SystemParam.path.binaryInputFolder;
		if (!new File(absolutePath).exists()){
			new File(absolutePath).mkdirs();
		}
    }	
	
	class rtvClass{
		int error;
		String msg;
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
    	    	
		ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
		// max file size is 1MB
		uploadHandler.setSizeMax(1024*1000);
		PrintWriter writer = response.getWriter();
		// The file uploader plugin acquire that the content type must be "text/plain"
		response.setContentType("text/plain");
		rtvClass rtv = new rtvClass();
		rtv.error = 0;
		
		try {
			List<FileItem> items = uploadHandler.parseRequest(request);
			for (FileItem item : items) {
				if (!item.isFormField()) {
					String fileName = item.getName();
					if (fileName != null) {
						fileName = FilenameUtils.getName(fileName);
					 }
					//System.out.println(absolutePath + fileName);
					File file = new File(absolutePath + fileName);
					
					// If file is already existed 
					if (file.exists()){
						System.out.println("File exist!");
						rtv.error = 1;
						rtv.msg = new String("File exists in the server! Please change the file name.");
						
					} else {
						// otherwise, save the file in the server
						item.write(file);
						//writer.write("{\"name\":\""+ item.getName() + "\",\"type\":\"" + item.getContentType() + "\",\"size\":\"" + item.getSize() + "\"}");
						
						synchronized (UploadFileList.items){
							long currTime = (long) (System.currentTimeMillis() / 1000);
							UploadFileList.items.put(file, currTime);
							System.out.println("[" + file.getName()+", "+ currTime);
						}
						rtv.msg = new String("File uploading success!");
						
						break; // assume we only get one file at a time
					}
				}
			}
		} catch (FileUploadException e) {
			rtv.error = 1;
			rtv.msg = new String("The maximum uploaded file size is 1MB!");
		} catch (Exception e) {
			rtv.error = 1;
			rtv.msg = new String("Server error!");
		} finally {
			String json = new Gson().toJson(rtv);
			System.out.println(json);
			//application/javascript
			//application/json
			response.setContentType("text/html");
			// "application/javascript" is for the ajax upload plugin
			response.setCharacterEncoding("UTF-8");
			writer.print(json);			
			writer.close();
		}    	
    	
    }
}


