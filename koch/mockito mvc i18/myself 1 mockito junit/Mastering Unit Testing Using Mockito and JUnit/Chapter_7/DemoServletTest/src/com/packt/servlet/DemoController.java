package com.packt.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DemoController")
public class DemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DemoController() {
	}

	protected void doGet(HttpServletRequest req,
			HttpServletResponse res) throws ServletException, IOException {
		String urlContext = req.getServletPath();
		if(urlContext.equals("/")) {
			req.getRequestDispatcher("login.jsp").forward(req, res);  
		}else if(urlContext.equals("/home.do")) {
			req.getRequestDispatcher("home.jsp").forward(req, res);  
		}else {
			req.setAttribute("error", "Invalid request path '"+urlContext+"'");
			req.getRequestDispatcher("error.jsp").forward(req, res);  
		}
		
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
