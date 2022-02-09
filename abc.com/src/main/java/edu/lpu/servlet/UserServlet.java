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

	//protected void doGet(HttpServletRequest request, HttpServletResponse response)
protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("name");

		out.print("id is " + id);
		out.print("<br>name  is " + name);

		String language[] = request.getParameterValues("language");
		out.print("<br>language you preferred  are ");

		out.print("<ol> ");
		for (String string : language) {
			out.println("<li>" + string);
		}
		out.print("</ol> ");
	}

}
