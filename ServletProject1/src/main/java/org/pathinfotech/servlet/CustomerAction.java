package org.pathinfotech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CustomerAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
	
		response.setContentType("text/html");
		
		String qstring=request.getQueryString();
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
//		String hobbies = request.getParameter("hobbies");// single value
		String hobbies[] = request.getParameterValues("hobbies");
		
		out.print("Id is "+id);
		out.print("<br>Name is "+name);
		out.print("<br>Query String is "+qstring);
		
		out.print("<b>my Hobbies are </b><ol>");
		for (String string : hobbies) {
			out.print("<li>"+string);
		}
		out.print("</ol>");
	}


}
