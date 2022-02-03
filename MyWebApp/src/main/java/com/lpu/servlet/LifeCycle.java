package com.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
int c;
String name;
	@Override
	public void init() throws ServletException {
		System.out.println("init called ");
	  c=1;
	  name="surendra kumar";
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.print("<h1>Page Hits "+c++);
		out.print("</h1>");
		out.print("<h2>Name is  "+name+"</h2>");
		
		System.out.println("service/doGet called   ");
	}

	@Override
	public void destroy() {
		System.out.println("destroy called ");
	}
}
