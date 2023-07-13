package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MySearchEngine")
public class MySearchEngine extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		String parameter = request.getParameter("engine");
		
		switch (parameter) {
		case "google": {
			   response.sendRedirect("https://www.google.com/");
			break;
		}
		case "bing": {
			response.sendRedirect("https://www.bing.com/");
			break;
		}
		case "yahoo": {
			response.sendRedirect("https://in.search.yahoo.com/");
			break;
		}
		
		case "duckduckgo": {
//			response.sendRedirect("https://duckduckgo.com/");
			response.sendRedirect("bbc");
			//response.sendError(HttpServletResponse.SC_NOT_FOUND);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + parameter);
		}
	}


}
