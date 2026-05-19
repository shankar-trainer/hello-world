package com.montran.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
  	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    PrintWriter  out=response.getWriter();
		out.println("<h1>Student Information</h1>");
		String id=request.getParameter("name");
		String name=request.getParameter("roll");
		
		out.print("<br>Roll is "+id);
		out.print("<br>Name is "+name);
		String hb[]=request.getParameterValues("hb");
		
		out.print("<br>Hobbies Are <br>");
		out.print(Arrays.toString(hb));
		
		
	}

	
}
