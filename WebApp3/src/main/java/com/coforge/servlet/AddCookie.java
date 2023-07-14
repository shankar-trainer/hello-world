package com.coforge.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookie")
public class AddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie cookie1=new Cookie("empid1","coforge_emp_100001");
		Cookie cookie2=new Cookie("empid2","coforge_emp_100002");
		Cookie cookie3=new Cookie("empid3","coforge_emp_100003");
		
		cookie1.setMaxAge(10);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		
		response.setContentType("text/html");
		
		response.getWriter().print("<h2>cookie added<h2>");
		
	}

}
