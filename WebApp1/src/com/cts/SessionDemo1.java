package com.cts;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionDemo1")
public class SessionDemo1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		HttpSession session = request.getSession();
		response.setContentType("text/html");

		out.print("session id " + session.getId());

		if(session.isNew()) {
			out.print("<br>Your session has expired ");
		}
		else {
		Object product = session.getAttribute("prd");
		Object productId = session.getAttribute("prdId");
		Object productCost = session.getAttribute("prdCost");
		
		out.print("<br>Product name is "+product);
		out.print("<br>Product Id is "+productId);
		out.print("<br>Product Cost is "+productCost);
		}
	}

}
