package com.cts.servlet;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/UserServlet")
public class UserServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
      
	
	public void init(ServletConfig config) throws ServletException {
    	System.out.println("init called ");
	}

	public void destroy() {
		System.out.println("destroy called ");
	}


	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("service called ");
	
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<h2>hello world...</h2>");
		
	}

}
