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
//@WebServlet("/hello")
@WebServlet(urlPatterns = {"/hello","/Welcome","/MyFirstServlet"})
public class MyFirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int count;// instance variable 
	String name;
	public void init(ServletConfig config) throws ServletException {
	    count=1;
	    name="ram sharan";
		System.out.println("init called");
	}

	public void destroy() {
		System.out.println("destroy called");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do get service called");
        int x=1;	//local variable
		PrintWriter pw=	response.getWriter();
		pw.print("<br><font color='blue'>count is "+count++ );
		pw.print("<br>name  is "+name );
		pw.print("<br>x   is "+x );
	pw.print("</font>" );
	}
}
