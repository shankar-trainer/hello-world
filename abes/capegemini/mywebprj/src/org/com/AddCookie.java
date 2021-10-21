package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddCookie")
public class AddCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		Cookie cookie1=new Cookie("emp1_sal", "20000");
		Cookie cookie2=new Cookie("emp2_sal", "25000");
		Cookie cookie3=new Cookie("emp3_sal", "10000");
		Cookie cookie4=new Cookie("emp4_sal", "15000");

		cookie3.setMaxAge(10);
		
		response.addCookie(cookie1);
		response.addCookie(cookie2);
		response.addCookie(cookie3);
		response.addCookie(cookie4);
		
		out.print("Cookie added ");
	}

}
