package org.com.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Person extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String lang;
	String  userinterface;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	lang=config.getInitParameter("language");
	userinterface=config.getInitParameter("ui");
	}
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out=response.getWriter();
	  out.print("language is "+lang);
	  out.print(" <br><br>userinterface  is "+userinterface);
	}

}
