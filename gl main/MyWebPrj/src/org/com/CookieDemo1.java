package org.com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CookieDemo1")
public class CookieDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    Cookie cookie1=new Cookie("emp01", "12000");
	    Cookie cookie2=new Cookie("emp02", "14000");
	    Cookie cookie3=new Cookie("emp03", "10000");
	    
	    cookie1.setMaxAge(365*24*3600);
	    cookie2.setMaxAge(365*24*3600);
	    cookie3.setMaxAge(365*24*3600);
	    	    
	    response.addCookie(cookie1);
	    response.addCookie(cookie2);
	    response.addCookie(cookie3);
	    
		response.getWriter().print("cookie added");
	}
}
