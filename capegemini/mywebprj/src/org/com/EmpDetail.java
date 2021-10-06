package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EmpDetail")
public class EmpDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		String id, name, pass, location;
		id = request.getParameter("id");
		name = request.getParameter("name");
		location = request.getParameter("location");
		out.print("<h2>Employee Details</h2>");
		out.print("<ul>");

		out.print("<li>Id " +id);
		out.print("<li>name " + name);
		out.print("<li>name " + location);

		out.print("</ul>");
	}
}
