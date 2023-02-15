package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     PrintWriter out=		response.getWriter();
     
	 String id = request.getParameter("id");
	 String name = request.getParameter("name");
	 String language[] = request.getParameterValues("language");
	 out.print("<h1>User Information</h1>");
	 out.print("<p>User Id : "+id);
	 out.print("<p>User Name : "+name);
	 out.print("<p>User Language : <ul>");
	 
	 for(String s:language) {
		 out.print("<li>"+s);
	 }
	 out.print("</ul>");
	 out.print("<p>Query String : "+request.getQueryString());
	 
	 
	}


}
