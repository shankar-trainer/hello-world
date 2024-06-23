package org.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("//MyOrderDetailServlet")
public class MyOrderDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		String id = request.getParameter("loginId");
		String name = request.getParameter("loginName");
		String fitem = request.getParameter("fooditem");
      
		PrintWriter writer = response.getWriter();
	   
		writer.print("<div>");
		writer.print("customer id is "+id);
		writer.print("customer name is "+name);
		writer.print("customer food item  is "+fitem);
		
		writer.print("</div>");
		 
	}

}
