package org.com.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.com.dao.LoginDao;

@WebServlet("/Payment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		if (session.isNew())
			out.print("<h1>Your Session has Expired<h1>");
		else {
			out.print("<br><a href='Logout'>Logout</a><br>");
			
			Object id = session.getAttribute("id");

			Object product1 = session.getAttribute("prd1");
			Object product2 = session.getAttribute("prd2");

			out.print("<h1>Payment Page </h1>");
			out.print("Ur id is " + id);
			out.print("<br>You have following products in Kart ");
			out.print("<br><ul><li>" + product1);
			out.print("<li>" + product2);
			out.print("</ul>");
		}
	}
}
