package com.cts.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;

@WebServlet(urlPatterns = "/StudentServlet", initParams = { @WebInitParam(name = "id", value = "10001"),
@WebInitParam(name = "name", value = "suresh kumar"), @WebInitParam(name = "location", value = "madurai"), })

public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int id;
	String name;
	String location;
	
	String country;
	String capital;
	
	ServletContext context;

	@Override
	public void init(ServletConfig config) throws ServletException {
	  id=Integer.valueOf(config.getInitParameter("id"));
	  name=config.getInitParameter("name");
	  location=config.getInitParameter("location");
	
	  context=config.getServletContext();
	
	 country= context.getInitParameter("country");
	 capital= context.getInitParameter("capital");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        
        out.println("Student information<br>");
        out.println("<br> id "+id);
        out.println("<br>name "+name);
        out.println("<br>location "+location);
        out.println("<br>country "+country);
        out.println("<br>capital  "+capital);
        
	}

}
