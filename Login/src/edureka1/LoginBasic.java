package edureka1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class LoginBasic extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		resp.setContentType("text/html");

		String name = req.getParameter("userName");
		String password = req.getParameter("userPassword");

		if (name.equals("mittul") && password.equals("1234")) {
			pw.println("Login Successful...!");
			pw.println("Welcome " + name + "!");
		} else {
			pw.println("Login Failed...!");
		}

		pw.close();
	}
}
