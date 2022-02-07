package edu.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		String hb[] = request.getParameterValues("hobby");

		if (id == null || id.isEmpty() || name == null || name.isEmpty() || hb == null)
			response.sendRedirect("index.html");
		else {
			out.println("id is " + id);
			out.println("<br>name is " + name);

			out.println("<br>Hobbies are  ");
			out.print("<ul>");
			for (String string : hb) {
				out.print("<li>" + string);
			}
			out.print("</ul>");
		}
	}
}
