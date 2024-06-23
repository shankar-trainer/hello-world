package org.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
	String country;
     int count=0;
	@Override
	public void init() throws ServletException {
		System.out.println("init called");
		country = "india";
	}

	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		  PrintWriter out = response.getWriter();
	  int c=1;
		  System.out.println("service method called");
		System.out.println("country is " + country);
        out.println("<b>country is " + country+"</b>");
        out.println("<h2>user visit count is " + count+"</h1>");
        out.println("<h2>local c  is " + c+"</h1>");
        count++;
        c++;
	}

	@Override
	public void destroy() {
		System.out.println("destroy  method called");
	}

}
