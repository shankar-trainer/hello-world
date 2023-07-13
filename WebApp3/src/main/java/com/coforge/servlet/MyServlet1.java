package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyServlet1")
//@WebServlet("/hello")
@WebServlet(urlPatterns = { "/hello", "/MyServlet1" })

public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.print("<h1>Hello world</h1>");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hb[] = request.getParameterValues("hb");

		out.print("<br>Id is " + id);
		out.print("<br>Name is " + name);
		// String queryString = request.getQueryString();
		// out.print("<br>Query String is "+queryString);

		out.print("<p>Hobbies are  ");
		out.print("<ol> ");
		for (String h : hb)
			out.print("<li>" + h);

		out.print("</ol> ");

	}

}
