package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out=response.getWriter();
		
		String search=request.getParameter("searchengine");
		//RequestDispatcher dispatcher;
		
		switch (search) {
		case "google":
			response.sendRedirect("https://www.google.com/");
			break;
		case "yahoo":
			response.sendRedirect("https://search.yahoo.com");
			break;
		case "bing":
			response.sendRedirect("https://www.bing.com/");
			break;
		case "duckduckgo":
			response.sendRedirect("https://duckduckgo.com/'");
			break;

		default:
			break;
		}

	}

}
