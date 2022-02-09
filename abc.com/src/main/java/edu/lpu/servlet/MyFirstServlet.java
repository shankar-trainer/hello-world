package edu.lpu.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/MyFirstServlet")
//@WebServlet("/Welcome")
@WebServlet(urlPatterns = { "/Welcome", "/Test", "/Hello", "/MyFirstServlet" })
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int count;  // instance variable 
	String country;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("init called");
		count = 1;
		country = "India";
	}

	public void destroy() {
		System.out.println("destroy called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet service  called");
		
        int x=1;// local variable 
        
		PrintWriter pw = response.getWriter();
		pw.print("hello world<br>");
		pw.print("hello world<br>");
		pw.print("<br>count is " + count++);
		pw.print("<br>local count x  is " + x++);
		pw.print("<br>country  is " + country);

	}

}
