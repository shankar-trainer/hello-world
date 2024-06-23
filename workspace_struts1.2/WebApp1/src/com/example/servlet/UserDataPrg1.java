package com.example.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDataPrg1
 */
public class UserDataPrg1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletContext ctx;
    ServletConfig cfg;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         cfg=getServletConfig();
         ctx=cfg.getServletContext();
         
         PrintWriter out=response.getWriter();
         out.print("product1 is "+ctx.getAttribute("product1"));
        		 out.print("price is "+ctx.getAttribute("price"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
