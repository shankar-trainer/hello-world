package com.abc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FactorialServlet")
public class FactorialServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int x=Integer.parseInt(request.getParameter("n1"));
		
		out.print("<h1>Factorial Program</h1>");
		
		WelcomeImplService service = new WelcomeImplService();

		Welcome welcomeImplPort = service.getWelcomeImplPort();
        out.print("<br>factorial of "+x+" is "+welcomeImplPort.factorial(x));	
		

	}

}
