package com.coforge.result;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/nindianServletPage")
public class nindianServletPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		Object cname = request.getAttribute("cname");
		String id = request.getAttribute("id").toString();
		
		
		writer.print("<h1>North Indian Menu</h1>");
		writer.print("<br>Order Id is "+id);
		writer.print("<br>Customer Name is "+cname);
		
		writer.print("<ol>");
		writer.print("<li>Poori sabji ");
		writer.print("<li>Rajma Chawal ");
		writer.print("<li>Chhhole Bahtore ");
		writer.print("<li>Samosa Chhat ");
		writer.print("<li>Paneer Paratha ");
		writer.print("</ol>");
		
		
		
	}
}
