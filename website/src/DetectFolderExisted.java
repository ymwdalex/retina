/*
 * When the user change to another image in the dropdown select box, at first, 
 * the server will detected if the image has already been processed.
 * Zhe Sun
 */

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class DetectFolderExisted
 */
@WebServlet("/DetectFolderExisted")
public class DetectFolderExisted extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DetectFolderExisted() {
        super();
    }

	String currentPath;
	public void init(final ServletConfig config) {
		currentPath = config.getServletContext().getRealPath("/");
        //System.out.println(CurrentPath);
    }
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String baseName = request.getParameter("baseName").toString();
		
		int rtv = 0;
		String folderName = currentPath + SystemParam.path.outputFolder + baseName + File.separator;
		File workFolder = new File(folderName);
		if (workFolder.exists()){
			// folder exist
			rtv = 0;
		} else {
			// folder not exist
			rtv = 1; 
		}
		
		String json = new Gson().toJson(rtv);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);		
	}
}
