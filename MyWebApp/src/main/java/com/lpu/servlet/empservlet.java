package com.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/empservlet")
public class empservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

//    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String skill[] = request.getParameterValues("skill");

		  response.setContentType("text/html");
		  
		out.println("<div style='background:pink;border:double;width:30%;padding:20px;margin-left:300px;'> " );
		out.println("id is " + id);
		out.println("<br>name is " + name);
		out.println("<br><br>gender is " + gender);
		out.println("<br><br>skill sets are following  ");
		
		out.println("<ol> " );
		 for(String s:skill)
			 out.println("<li> "+s );
		
		out.println("</ol> " );
		out.println("</div> " );
	}

}
