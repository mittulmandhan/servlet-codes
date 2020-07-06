package generic_edureka;

import java.io.*;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Generic extends GenericServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter pw = res.getWriter();
		res.setContentType("text/html");

		String name = req.getParameter("uname");
		String age = req.getParameter("uage");

		pw.println("Name: " + name);
		pw.println("Age: " + age);

		pw.close();
	}

}
