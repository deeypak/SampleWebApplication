import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Second extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		System.out.println("method -- " + req.getMethod());
		// doGet(req, res);
		if ("GET".equals(req.getMethod())) {
			doGet(req, res);
		} else {
			doPost(req, res);
		}
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	//	PrintWriter pw = resp.getWriter();
		String htmlString = "<html><head></head><body><h1>hello</h1></html>";
		String uname = req.getParameter("uname");
		
		String[] val = req.getParameterValues("chk");
		
		System.out.println("val is ----- " + val[0] + " " + val[1]);
		System.out.println("get method called ----- " + uname);
	//	pw.println(htmlString + " " + uname);
		req.getRequestDispatcher("new.html").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String uname = req.getParameter("uname");
		System.out.println("uname is == " + uname);
		System.out.println("post method called ---");
	}

	@Override
	public void destroy() {
		System.out.println("destroy method called ----- ");
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		System.out.println("init method called ----- ");
		super.init();
	}

}
