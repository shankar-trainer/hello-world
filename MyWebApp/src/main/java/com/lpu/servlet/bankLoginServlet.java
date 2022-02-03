package com.lpu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class bankLoginServlet
 */
@WebServlet("/bankLoginServlet")
public class bankLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		
         String id=request.getParameter("id");	    	 
         String pass=request.getParameter("pass");	    	 
         String account_type=request.getParameter("acttype");	    	 
		 
         response.getWriter().print("<h2>Include page</h2>");
         
         request.setAttribute("id", id);
         
         RequestDispatcher dispatcher;
         if(account_type.equals("saving")) {
        	 dispatcher=request.getRequestDispatcher("savingServlet");
             dispatcher.forward(request, response);
         }
         else  if(account_type.equals("current")) {
        	 dispatcher=request.getRequestDispatcher("currentServlet");
      	 dispatcher.forward(request, response);
     //   	 dispatcher.include(request, response);
         }
         
	
	}

}
