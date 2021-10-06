package org.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		Cookie cookie[]=request.getCookies();
		response.setContentType("text/html");
		
		for (Cookie cookie2 : cookie) 	
		response.getWriter().print(cookie2.getName()+" "+cookie2.getValue()+"<br>");
		
	}
}
