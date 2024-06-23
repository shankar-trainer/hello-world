package org.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CalcServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		out.println("servlet name is " + getServletName());
		out.println("<br> doGet method " );
		
		int n1 =  Integer.parseInt(request.getParameter("no1"));
		int  n2 = Integer.parseInt(request.getParameter("no2"));
		String op = request.getParameter("operation");

		out.print("<br>no1 is " + n1);
		out.print("<br>no2 is " + n2);
		out.print("<br>Operation is " + op);
		out.print("<br> ");
		
		switch (op) {
		case "addition":
			 out.print("addition of "+n1+" and "+n2+" is "+(n1+n2));
			break;
		case "subtraction":
			out.print("subtraction of "+n1+" and "+n2+" is "+(n1-n2));
			break;
		case "multiplication":
			out.print("multiplication of "+n1+" and "+n2+" is "+(n1*n2));
			break;
		case "division":
			out.print("division of "+n1+" and "+n2+" is "+(n1/n2));
			break;

		default:
			break;
		}
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
