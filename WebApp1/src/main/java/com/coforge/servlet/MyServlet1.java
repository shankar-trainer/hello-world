package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
//@WebServlet("/MyServlet1")
//@WebServlet("/UserData")
@WebServlet(urlPatterns = { "/UserData","/MyServlet1"}, initParams = {
		@WebInitParam(name = "company",value ="coforge" ),
		@WebInitParam(name = "state",value ="up" )
})
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String country, company_name,state_name;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
	System.out.println("init called"); 
	country="india";
	company_name=config.getInitParameter("company");
	state_name=config.getInitParameter("state");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		System.out.println("service called"); 
		PrintWriter out = response.getWriter();
		out.print("<br>My First servlet");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String hobby[] = request.getParameterValues("hobby");
		
		out.print("<br>Id is "+id);
		out.print("<br>Name is "+name);
		out.print("<br>Company Name is "+company_name);
		out.print("<br>State Name is "+state_name);
		out.print("<br><br>Hobbies are  ");

		out.print("<ol>  ");
		
		for (String string : hobby) {
			out.print("<li>"+string);
		}
		
		out.print("</ol> <p>  <ul>");
		
		Stream.of(hobby).forEach(a->out.print("<li>"+a));
		out.print("</ul>");
		
		out.print("<br>Country is "+country);
		String qstring=request.getQueryString();
		
		out.print("<br> Query String  is "+qstring);
		
	}

	@Override
	public void destroy() {
		System.out.println("destroy called");
	}
	 
	
	
}
