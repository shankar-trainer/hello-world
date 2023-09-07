package com.coforge.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String id,pass,actType; 
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 id=request.getParameter("id");
	 pass=request.getParameter("pass");
	 actType=request.getParameter("account_type");
		response.setContentType("text/html");

	response.getWriter().print("<h2>Controller page</h2>");
	 RequestDispatcher dispatcher;
	 if(actType.equals("saving")) {
		 request.setAttribute("int_rate",5);
		 request.setAttribute("location","sec1 gr noida");
		 dispatcher=request.getRequestDispatcher("SavingAccountPage");
		 dispatcher.forward(request, response);
	 }
	 
	 if(actType.equals("current")) {
		 request.setAttribute("location","sec2 gr noida");
		 request.setAttribute("int_rate",1);
		 dispatcher=request.getRequestDispatcher("CurrentAccountPage");
//		 dispatcher.forward(request, response);
		 dispatcher.include(request, response);
	 }
	 
	}

}
