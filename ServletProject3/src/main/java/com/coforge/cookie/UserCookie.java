package com.coforge.cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserCookie")
public class UserCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Cookie cookie1;
	Cookie cookie2;
	Cookie cookie3;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		cookie1=new Cookie("empid1", "coforge_emp00001");
		cookie2=new Cookie("empid2", "coforge_emp00002");
		cookie3=new Cookie("empid3", "coforge_emp00003");
		
//		cookie1.setMaxAge(10);
		cookie1.setMaxAge(24*60*60*365);// set cookie max age for 1 year
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		response.setContentType("text/html");
		response.getWriter().print("<h2>All 3 Employee cookie added");
	}


}
