package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductPaymentServlet")
public class ProductPaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	 PrintWriter out=response.getWriter();
	 response.setContentType("text/html");
	  
	 out.print("<h2>Product Payment page</h2>");
	
	 
	 out.print("<h2>Product Details </h2>");
	 String qstring=request.getQueryString();
	 System.out.println(qstring);
	 
	 String url="PaymentDetail?"+qstring;
	 
	// out.print("<a href='PaymentDetail'>Product Details </a>");
	 out.print("<a href="+url+">Product Details </a>");
	 
	 
	 
	 
	}


}
