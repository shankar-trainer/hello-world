package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContextPrg2")
public class ContextPrg2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ServletContext ctx;
	String capital;
	@Override
	public void init(ServletConfig config) throws ServletException {
       ctx=config.getServletContext();
       capital=ctx.getInitParameter("capital");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     PrintWriter out=		response.getWriter();
	  out.print("country is "+ctx.getAttribute("country"));	
	  out.print("<br>capital is "+capital);	
	  out.print("<br>college is "+ctx.getAttribute("college"));	
	}
}
