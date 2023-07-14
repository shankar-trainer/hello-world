package com.coforge.controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   
		response.getWriter().print("<h1>Controller Page</h1>");
		response.getWriter().print("<h3>Date is "+LocalDate.now()+" </h2>");
		
		String ftype = request.getParameter("foodtype");
		String OrderId = request.getParameter("OrderId");
		String Cname = request.getParameter("Cname");
		
		request.setAttribute("cname", Cname);
		request.setAttribute("id", OrderId);
		
		RequestDispatcher dispatcher;
		if(ftype.equals("nindian")) {
			dispatcher=request.getRequestDispatcher("/nindianServletPage");
//			dispatcher.forward(request, response);
			dispatcher.include(request, response);
		}
		else if(ftype.equals("sindian")) {
			dispatcher=request.getRequestDispatcher("/sindianServletPage");
			dispatcher.forward(request, response);
		}
	}


}
