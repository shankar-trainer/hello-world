package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Logout")
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		PrintWriter out=response.getWriter();
		out.print("<h1>Logout page</h1>");
		
		request.getSession().invalidate();
		
		
		
		out.print("<h1>You have logged out successfully</h1>");
		
		out.println("<br><br><a href='RestaurantPage.html'>Login Again</a>");
	}

	

}
