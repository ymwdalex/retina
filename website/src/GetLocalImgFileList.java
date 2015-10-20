/*
 * This servlet return the file list of the image file in the database
 * Zhe Sun
 */

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.google.gson.Gson;

import java.io.*;
import java.util.ArrayList;

/**
 * Servlet implementation class GetLocalImgFileList
 */
@WebServlet("/GetLocalImgFileList")
public class GetLocalImgFileList extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	
	private class ImgFileList{
		String name; // image file name
		int type; // 0 color  1 binary
	}
	
	public GetLocalImgFileList() {
		super();
	}

	String CurrentPath;
	public void init(final ServletConfig config) {
		CurrentPath = config.getServletContext().getRealPath("/");
        // System.out.println(CurrentPath);
    }	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Get binary image list
		File file = new File(CurrentPath + SystemParam.path.binaryInputFolder);
		File[] files = file.listFiles();  
		ArrayList<ImgFileList> fileNames = new ArrayList<ImgFileList>();
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Image files", "jpg", "png", "tif", "gif", "GIF");
		for (int fileInList = 0; fileInList < files.length; fileInList++)  
		{  
			if (!files[fileInList].isDirectory() && filter.accept(files[fileInList])){
				String fullName = files[fileInList].toString();
				int sep = fullName.lastIndexOf(File.separatorChar );
				ImgFileList imgFile = new ImgFileList();
				imgFile.name = fullName.substring(sep + 1);
				imgFile.type = 1;
				fileNames.add(imgFile);
			}
		}

		// Get color image list
		file = new File(CurrentPath + SystemParam.path.originalInputFolder);
		files = file.listFiles();  
		filter = new FileNameExtensionFilter("Image files", "jpg", "png", "tif", "gif", "GIF");
		for (int fileInList = 0; fileInList < files.length; fileInList++)  
		{  
			if (!files[fileInList].isDirectory() && filter.accept(files[fileInList])){
				String fullName = files[fileInList].toString();
				int sep = fullName.lastIndexOf(File.separatorChar );
				ImgFileList imgFile = new ImgFileList();
				imgFile.name = fullName.substring(sep + 1);
				imgFile.type = 0;
				fileNames.add(imgFile);
			}
		}

		
		String json = new Gson().toJson(fileNames);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);		
	}

}
