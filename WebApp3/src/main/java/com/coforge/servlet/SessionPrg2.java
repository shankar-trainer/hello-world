package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionPrg2")
public class SessionPrg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter writer = response.getWriter();

		HttpSession session = request.getSession();

		Object product1 = session.getAttribute("prd1");
		Object product2 = session.getAttribute("prd2");
		Object productprice1 = session.getAttribute("prd1Cost");
		Object productprice2 = session.getAttribute("prd2Cost");

		response.setContentType("text/html");

		writer.print("<h2>Product Details </h2>");
        writer.print("<ol>" );
        		writer.print("<li> product1 "+product1);
        		writer.print("<li> product1 cost  "+productprice1);
        		
        		writer.print("<li> product2 "+product2);
        		writer.print("<li> product2 cost  "+productprice2);
        		
        		writer.print("</ol>" );
	}

}
