package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/SessionDemo")
public class SessionDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		response.setContentType("text/html");
		
		out.print("session id " + session.getId());
		
		out.print("<br>session max inactive time interval  " + session.getMaxInactiveInterval());
		
		session.setMaxInactiveInterval(5);
		
		session.setAttribute("prd", "cycle");
		session.setAttribute("prdId", "cycle12344");
		session.setAttribute("prdCost", 12000);

		out.print("<br><br><a href='SessionDemo1'>Product Details</a>");

	}

}
