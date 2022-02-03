package com.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/currentServlet")
public class currentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
        out.println("<h1>Welcome to Current Account  Page</h1>");
        out.println("<br>Id is "+request.getAttribute("id"));
        
        
        
	}

}
