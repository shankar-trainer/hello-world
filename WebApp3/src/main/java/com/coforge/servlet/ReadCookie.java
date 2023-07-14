package com.coforge.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		Cookie[] cookies = request.getCookies();
		
		
		response.setContentType("text/html");
		
		for(Cookie c:cookies) 
		response.getWriter().print("<br> name "+c.getName()+"   value "+c.getValue());
		
	}

}
