package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/Welcome")
@WebServlet(urlPatterns={"/Welcome","/Test","/Hello"})

public class ServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int count;
	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		count=1;
	}

	@Override
	public void destroy() {
		System.out.println("destroy called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1>user hits "+(count++)+"</h1>");
		
		System.out.println("service called..");
	}

}
