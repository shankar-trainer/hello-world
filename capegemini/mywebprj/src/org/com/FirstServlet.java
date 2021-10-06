package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    int counter;
    
	public void init(ServletConfig config) throws ServletException {
          counter=1;
		System.out.println("init called ");
	}

	public void destroy() {
		System.out.println("destroy called");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
	
		out.print("User Hits "+counter++);
		
		response.setContentType("text/html");
		
		int x=1;
		out.print("<br>X count  "+x++);
		
		
		
		System.out.println("service called");
	}

	
}
