package org.com;

import java.io.IOException;

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
	  String id=request.getParameter("uid");
	  String name=request.getParameter("name");
	  String type=request.getParameter("type");
	  response.setContentType("text/html");
	  
	  request.setAttribute("location", "new delhi");
	  request.setAttribute("country", "India");
	  
	  
	  RequestDispatcher dispatcher,dispatcher1;
	  
	  if(id.isEmpty()||name.isEmpty()) {
			/*
			 * dispatcher=request.getRequestDispatcher("error.html");
			 * dispatcher.include(request, response);
			 */
		  request.getRequestDispatcher("error.html").
		     include(request, response);	 
		  request.getRequestDispatcher("UserForm1.html").
		     include(request, response);	 
		  
			/*
			 * dispatcher1=request.getRequestDispatcher("UserForm1.html");
			 * dispatcher1.include(request, response);
			 */
	  }
	  else if(type.equals("veg")) {
		  dispatcher=request.getRequestDispatcher("Veg");
		  dispatcher.forward(request, response);
	  }
	  else if(type.equals("non-veg")) {
		  dispatcher=request.getRequestDispatcher("NonVeg");
		  dispatcher.forward(request, response);
	  }
	  else if(type.equals("chinese")) {
		  dispatcher=request.getRequestDispatcher("Chinese");
		  dispatcher.forward(request, response);
	  }
	  else if(type.equals("south indian")) {
		  dispatcher=request.getRequestDispatcher("SouthIndian");
		  dispatcher.forward(request, response);
	  }
	  
	  	
	}

 

}
