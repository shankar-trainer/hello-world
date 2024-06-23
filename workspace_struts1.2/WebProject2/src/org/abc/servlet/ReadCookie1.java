package org.abc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie1")
public class ReadCookie1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  response.setContentType("text/html");    
		Cookie[] cookies = request.getCookies();
		      for (Cookie cookie : cookies) {
response.getWriter().print("<br> name "+cookie.getName()+"\tvalue\t"+cookie.getValue()+"\tage\t"
		      +cookie.getMaxAge());
			}
		
	}

}

