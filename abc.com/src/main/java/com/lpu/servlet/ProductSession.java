package com.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductSession")
public class ProductSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		Object product1 = session.getAttribute("prd1");
		Float cost = (Float) session.getAttribute("prd1cost");
		   PrintWriter out=		response.getWriter();
  out.print("product1 is "+product1);			
  out.print("<br>product cost  is "+cost);			
}

}
