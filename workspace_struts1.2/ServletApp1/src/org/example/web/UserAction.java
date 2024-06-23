package org.example.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	String country;
	String servletName;
	ServletContext ctx;
	@Override
	public void init(ServletConfig config) throws ServletException {
	  country=config.getInitParameter("country");
	  servletName=config.getServletName();
	 ctx=config.getServletContext();
	}
	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		String nm = request.getParameter("name");
		//String cities = request.getParameter("cities");// getParameter -- gives single value
		String cities[] = request.getParameterValues("cities");
      
		out.print("<br>Servlet context parameter greeting value "+ctx.getInitParameter("greeting"));
		out.print("<br><br>Servlet name Is "+servletName);
		out.println("<br><b>User Details</b><br>");
		
		out.print("<br>User Id is "+id);
		out.print("<br>User Name is "+nm);
		out.print("<br>User Country is "+country);
		out.print("<br>User Cities are "+Arrays.toString(cities));
		
		out.print("<br><br>Query String  is "+request.getQueryString());
		
	}

}
