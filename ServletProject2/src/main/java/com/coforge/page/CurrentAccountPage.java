package com.coforge.page;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/CurrentAccountPage")
public class CurrentAccountPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
     String id; 
     
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
    	 id=request.getParameter("id");

    	 Object rate = request.getAttribute("int_rate");
    	 Object location = request.getAttribute("location");
    	 
    	 response.getWriter().print("<br><h1>Welcome to Current Account Page</h1>");
    	 response.getWriter().print("id :"+id);
    	 response.getWriter().print("<br>Interest rate  :"+rate);
    	 response.getWriter().print("<br>Location  :"+location);
   
	}

	 

}
