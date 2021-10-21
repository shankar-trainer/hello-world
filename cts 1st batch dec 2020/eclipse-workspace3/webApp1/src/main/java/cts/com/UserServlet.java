package cts.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {

	private int empId;
	private String empName;

	@Override
	public void init() throws ServletException {
		System.out.println("init called ");
		empId = 88778778;
		empName = "mohan lal";
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get called ");

		PrintWriter out = resp.getWriter();

		empId = Integer.parseInt(req.getParameter("id"));
		empName = req.getParameter("name");

		out.println("<h1>hello world</h1>");
		out.print("<br>emp Id is " + empId);
		out.print("<br>emp Name is " + empName);
	}

	@Override
	public void destroy() {
		System.out.println("destroy called ");
	}

}
