package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionPrg1")
public class SessionPrg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	PrintWriter writer = response.getWriter();
  	
	HttpSession session = request.getSession();
	
	session.setAttribute("prd1", "jeans pant");
	session.setAttribute("prd2", "denim shirt");
	session.setAttribute("prd1Cost", 1500);
	session.setAttribute("prd2Cost", 1200);
	
	response.setContentType("text/html");
	
	writer.print("<h2>Data Addded to the Session</h2>");
	
	writer.print("<a href='SessionPrg2'>Product  Deatils</a>");
	
	writer.print("<br>Session Max Inactive Interval  "+session.getMaxInactiveInterval());
	writer.print("<br>Session Creation Time   "+new Date(session.getCreationTime()));
	//writer.print("<br>Session Creation Time   "+LocalTime.ofSecondOfDay(session.getCreationTime()));
	
	
   	
	
	}


}
