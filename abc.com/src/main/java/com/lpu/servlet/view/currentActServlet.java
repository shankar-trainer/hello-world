package com.lpu.servlet.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class currentActServlet
 */
@WebServlet("/currentActServlet")
public class currentActServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=	response.getWriter();
	
		Object id  = request.getAttribute("id");
		Object name  = 	request.getAttribute("name");
		
		out.print("<h1>Current Account Page</h1>");
		out.print("<br>id is "+id);
		out.print("<br>name is "+name);
		}

}
