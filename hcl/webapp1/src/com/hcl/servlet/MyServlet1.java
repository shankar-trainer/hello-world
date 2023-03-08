package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyServlet1")
@WebServlet("/welcome1")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;
	String name;
	public void init(ServletConfig config) throws ServletException {
	     count=1;
	     name="ram kumar";
		System.out.println("init called");
	}

	public void destroy() {
		System.out.println("destroy called");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do get service called");
		PrintWriter out = resp.getWriter();
		out.println("do get called");
		out.println("<h2>Name is "+name+"</h2>");
		out.println("<h2>User Count  is "+count+"</h2>");
	count++;
	}

//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		  System.out.println("service called..");
//
//	}

}
