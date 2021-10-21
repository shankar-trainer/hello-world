package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Hello")
@WebServlet(urlPatterns = {"/Hello","/Welcome"})
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out=response.getWriter();
	String id1= request.getParameter("id");
	String name= request.getParameter("name");
	 
	response.setContentType("text/html");
	out.println("Id is "+id1);
	out.println("<br>Name  is "+name);
	
	 String qs=request.getQueryString();
	 
	 out.println("<br>QueryString  is "+qs);
	 
	}
}
