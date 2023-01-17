package org.pathinfotech.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AspireHeightshome extends HttpServlet {
	private static final long serialVersionUID = 1L;
     int count;
      @Override
    public void init() throws ServletException {
      count=0;
      }
  
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 	PrintWriter writer = response.getWriter();
         ServletOutputStream outputStream=null;
         
	     writer.print("<br>visit count is "+count);
         writer.print("<br>method name  is ");
         
         if(count==10)
      	   destroy();
         else 
        	 count++;
	}
	 @Override
	public void destroy() {
        System.out.println("destroy called ");
	 }
}
