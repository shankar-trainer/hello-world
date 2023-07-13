package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int counter;
	@Override
	public void init() throws ServletException {
	 System.out.println("init called");
	  counter=1;
	}
    
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("service called ");
		System.out.println("user hits  "+counter);
		
		PrintWriter out = resp.getWriter();
		
		out.print("<br><h2>User hits"+counter+++"</h2>");
	    
	}
	
	
	@Override
	public void destroy() {
		System.out.println("destroy called ");
	}
}
