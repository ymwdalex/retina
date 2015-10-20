/*
 * This servlet is executed when the user click "Detect the vascular bifurcations" button
 * Java servlet will call the matlab method and generate the system output of each operators
 */

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import retina.COSFIRE;

import com.google.gson.Gson;
import com.mathworks.toolbox.javabuilder.MWCharArray;
import com.mathworks.toolbox.javabuilder.MWException;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	String CurrentPath;
	public void init(final ServletConfig config) {
		CurrentPath = config.getServletContext().getRealPath("/");
        //System.out.println(CurrentPath);
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fileName = request.getParameter("fileName").toString();

		COSFIRE matlabClass = null;
		try {
			matlabClass = new COSFIRE();
		} catch (MWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(CurrentPath);
		MWCharArray currPath = new MWCharArray(CurrentPath);
		
		String baseName = fileName.substring(0, fileName.lastIndexOf(".gif"));
		MWCharArray baseNameInput = new MWCharArray(baseName);

		int rtv = 0;
		try {
			matlabClass.retina(currPath, baseNameInput);
		} catch (MWException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			rtv = 1;
		}
		
		String json = new Gson().toJson(rtv);
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(json);
	}

}
