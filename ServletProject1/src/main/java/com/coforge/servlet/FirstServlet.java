package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;

	public void init(ServletConfig config) throws ServletException {
		count = 1;
		System.out.println("init called ");
	}

	public void destroy() {
		System.out.println("destroy called ");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do get  called ");
		System.out.println("count is  " + count++);
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		out.print("<link rel='stylesheet' type='text/css' media='screen' href='css/style1.css'>");
		out.print("<div class='hello'>");
		out.print("<br>count is ... " + count);

		out.print("<br>Id is " + id);
		out.print("<br>Name is " + name);
		out.print("</div>");
	}

}
