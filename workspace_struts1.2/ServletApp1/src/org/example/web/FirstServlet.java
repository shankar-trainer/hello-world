package org.example.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   String country;
   int counter;
	public void init(ServletConfig config) throws ServletException {
     System.out.println("init called");
	  country="india";
	  counter=1;
	}
	public void destroy() {
		System.out.println("destroy called");
	  counter=0;
	  country=null;
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet called");
		PrintWriter out = response.getWriter();
		out.println("<h2>hello to my servlet</h2>");
		out.println("<br>my country is "+country);
		out.println("<br>user count  is "+counter++);
		doPost(request, response);
	}
//using html form doPost can be called
	// doPost can be called using doGet
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost called");
	}

}
