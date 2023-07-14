package com.coforge.result;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/sindianServletPage")
public class sindianServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		writer.print("<h1>Sorth Indian Menu</h1>");
		

		Object cname = request.getAttribute("cname");
		String id = request.getAttribute("id").toString();
		
		
		writer.print("<br>Order Id is "+id);
		writer.print("<br>Customer Name is "+cname);

		
		writer.print("<ol>");
		writer.print("<li>Masala Dosa");
		writer.print("<li>Plain Dosa ");
		writer.print("<li>Idli Sambhar ");
		writer.print("<li>Pongal ");
		writer.print("<li>Sabhar Bara ");
		writer.print("</ol>");
	}
}
