package com.coforge.cookie;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserReadCookie")
public class UserReadCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		Stream.of(cookies).forEach(a -> {
			out.print(a.getName() + " " + a.getValue() + "  domain .. "+a.getDomain()+"<br>");
		});

	}

}
