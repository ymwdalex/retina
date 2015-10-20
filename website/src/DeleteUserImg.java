/*
 * DeleteUserImg: when user want to get the encircled image, 
 * the image files with circle are generated and saved with the name timestamp.
 * If the user refresh or exit the page, the temporary file will be deleted
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

import org.apache.commons.io.FileUtils;

import com.google.gson.Gson;

/**
 * Servlet implementation class DeleteUserImg
 */
@WebServlet("/DeleteUserImg")
public class DeleteUserImg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserImg() {
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
		String timeStamp = request.getParameter("timeStamp").toString();
		
		String outputFolder = currentPath + SystemParam.path.outputFolder + timeStamp + File.separator;
		File folder = new File(outputFolder);

		int rtv = 0;
		//make sure directory exists
    	if(folder.exists()){
    		FileUtils.deleteDirectory(folder);
        }
		
    	
    	// return a dummy json package
		String json = new Gson().toJson(rtv);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);	    	
	}

}
