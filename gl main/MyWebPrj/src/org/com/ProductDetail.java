package org.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductDetail")
public class ProductDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		
		if(session.isNew())
			out.print("<h1>Your Session has expired </h1>");
		else{
		String mobile = (String) session.getAttribute("mobile");
		// Object cost
		float cost = (float) session.getAttribute("cost");

		Object seller = session.getAttribute("seller");
		Object model = session.getAttribute("model");

		out.print("My Product details are ");
		out.print("<ol>");
		out.print("<li>Mobile is " + mobile);
		out.print("<li>cost is " + cost);
		out.print("<li>Seller is " + seller);
		out.print("<li>Model is " + model);

		out.print("</ol>");
		}
	}
}
