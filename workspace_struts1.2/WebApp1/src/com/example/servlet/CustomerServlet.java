package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
      String id=request.getParameter("userId");
      String name=request.getParameter("userName");
      String salary=request.getParameter("userSalary");

      String cities[]=request.getParameterValues("cities");

      out.println("<h2>Cusomer data</h2>");
      out.print("<br> Id is "+id);
      out.print("<br> Name is "+name);
      out.print("<br>  Country Name is "+request.getAttribute("country"));
      out.print("<br> Salary is "+salary);
      out.print("<br> Cities are  "+Arrays.toString(cities));
      
      
      
	}

}
