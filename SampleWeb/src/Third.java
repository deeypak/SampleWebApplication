import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Third extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("context path = " + req.getContextPath());
		System.out.println("coming to do get method in third class");
		String uname = req.getParameter("uname");
		req.setAttribute("uname", uname);
	//	resp.sendRedirect("new.html");
		req.getRequestDispatcher("/goHere").forward(req, resp);
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("coming to do post method");
	}

	
	
}
