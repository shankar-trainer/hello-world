package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ReadCookie")
public class ReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		 Cookie cookie[]= request.getCookies();
		 
		 for (Cookie cookie2 : cookie) 
	out.print(cookie2.getName()+"    "+cookie2.getValue() +"<br>" );
		
		 out.print("<br>using java8 stream <br>");
		 
		 Stream.of(cookie).forEach
		 (a->out.print("<br>"+a.getName()+" "+a.getValue()));
		 
	}

}
