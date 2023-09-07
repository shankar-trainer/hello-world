package com.coforge.Session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserSession2")
public class UserSession2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");

		Object product1 = request.getSession().getAttribute("prd1");
		Object product2 = request.getSession().getAttribute("prd2");

		HttpSession session = request.getSession();
		if (session.isNew()) {
			writer.print("<h2>Your Session has expired </h2>");
		} else {
			// Object attribute = session.getAttribute("id");
			int id = Integer.valueOf(session.getAttribute("id").toString());
			String nm = session.getAttribute("name").toString();

			writer.println("<br>Id is " + id);
			writer.println("<br>Name is " + nm);
			writer.println("<br>Product1  is " + product1);
			writer.println("<br>Product2  is " + product2);
		}
	}
}
