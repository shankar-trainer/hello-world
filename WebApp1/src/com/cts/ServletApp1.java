package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletApp1")
public class ServletApp1 extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init called ");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doget  called ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost called ");
		// doGet(request, response);

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String salary = request.getParameter("salary");
		String hobby[] = request.getParameterValues("hobby");
		System.out.println("service called    ");
		PrintWriter out = response.getWriter();

		out.print("<div style='float:left;background:yellow;width:30%;margin-left:300px;border:solid;padding:1em'>");
		out.print("<h1>Customer Information</h1>");
		out.print("Id is " + id);
		out.print("<br>Name is " + name);
		out.print("<br>Salary is " + salary);

		out.print("<br>Ur hobbies are ");
		out.print("<br><ul>");
		for (String string : hobby) {
			out.print("<li>" + string);
		}

		out.print("</ul>");

		out.print("</div>");

	}

	@Override
	public void destroy() {
		System.out.println("destroy called ");
	}
}
