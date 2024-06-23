package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PaymentDetail")
public class PaymentDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 PrintWriter out=response.getWriter();
		 String id=request.getParameter("id");
		 String name=request.getParameter("name");

		 String prd1=request.getParameter("prdname1");
		 String cost1=request.getParameter("prdcost1");
		 
		 String prd2=request.getParameter("prdname2");
		 String cost2=request.getParameter("prdcost2");
		 
		 out.print("<table border='1' bgcolor='yellow' width=40%>");
		 
		 out.print("<tr><td>Welcome </td><td>"+name+"</td></tr>");
		 out.print("<tr><td>Welcome ur id is </td><td>"+id+"</td></tr>");
		 
		 
		 out.print("<tr><td>YOu have purchased follwing products </td><td> with given prices</td></tr>");
		 out.print("<tr><td>product1  is  </td><td>"+prd1+"</td></tr><tr><td> cost1 is  </td><td>"+cost1+"</td></tr>");
		 out.print("<tr><td>product2  is  </td><td>"+prd2+"</td></tr><tr><td> cost2 is  </td><td>"+cost2+"</td></tr>");
	}

}
