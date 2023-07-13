package com.coforge.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet1 extends HttpServlet {
	
	@Override
	public void init() throws ServletException {
	 System.out.println("init called ");
	}

	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	 System.out.println("service called");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy called ");
	}
	
}
