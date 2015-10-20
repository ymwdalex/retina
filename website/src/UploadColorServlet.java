/* This servlet is abandoned
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

public class UploadColorServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	String CurrentPath;
	String absolutePath;
	public void init(final ServletConfig config) {
		CurrentPath = config.getServletContext().getRealPath("/");
//		absolutePath = CurrentPath + SystemParam.path.originalInputFolder 
//			 + "upload" + File.separator;
		absolutePath = CurrentPath + SystemParam.path.originalInputFolder; 
		if (!new File(absolutePath).exists()){
			new File(absolutePath).mkdirs();
		}
    }	
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
    	    	
		ServletFileUpload uploadHandler = new ServletFileUpload(new DiskFileItemFactory());
		PrintWriter writer = response.getWriter();
		response.setContentType("text/plain");
		try {
			List<FileItem> items = uploadHandler.parseRequest(request);
			for (FileItem item : items) {
				if (!item.isFormField()) {
					//File file = File.createTempFile(item.getName(), "");
					System.out.println(absolutePath + item.getName());
					File file = new File(absolutePath + item.getName());					
					item.write(file);
					writer.write("{\"name\":\""+ item.getName() + "\",\"type\":\"" + item.getContentType() + "\",\"size\":\"" + item.getSize() + "\"}");
					break; // assume we only get one file at a time
				}
			}
		} catch (FileUploadException e) {
			throw new RuntimeException(e);
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			writer.close();
		}    	
    	
    }
}
