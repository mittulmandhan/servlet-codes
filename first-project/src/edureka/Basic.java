package edureka;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Basic extends HttpServlet {
	public String message;

	@Override
	public void init() throws ServletException {
		message = "Hello! Mittul";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");

		PrintWriter out = resp.getWriter();
		out.println("<h2>" + message + "</h2>");
	}

	@Override
	public void destroy() {
		System.out.println("Destroying");
	}
}
