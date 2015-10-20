/* This servlet is abandoned
 * Zhe Sun
 */


import java.io.File;
import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

public class UploadColorCheckServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	String CurrentPath;
	String absolutePath;
	public void init(final ServletConfig config) {
		CurrentPath = config.getServletContext().getRealPath("/");
		absolutePath = CurrentPath + SystemParam.path.originalInputFolder; 
//				 + "upload" + File.separator;
		if (!new File(absolutePath).exists()){
			new File(absolutePath).mkdirs();
		}
    }	
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException
    {
    	String fileName = request.getParameter("filename").toString();
    	int rtv;
    	
    	// don't support upload color image now
		System.out.println(absolutePath + fileName);
		File file = new File(absolutePath + fileName);
		if (file.exists()){
			rtv = 1;
		} else {
			rtv = 0;
		}

		String json = new Gson().toJson(rtv);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);	
    }
}

