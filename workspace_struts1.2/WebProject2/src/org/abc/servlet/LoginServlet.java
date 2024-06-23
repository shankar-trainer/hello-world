package org.abc.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 PrintWriter out=response.getWriter();
	 String id=request.getParameter("loginId");
	 String name=request.getParameter("loginName");
		out.println("id is "+id);
		out.println("<br>Name is "+name);
		
		out.print("<form action='LoginController'>");
		out.print("<h2>Select Search Engine</h2>");
		
		out.print("<input type='radio' name='searchengine' value='google'>Google<br>");
		out.print("<input type='radio' name='searchengine' value='yahoo'>Yahoo<br>");
		out.print("<input type='radio' name='searchengine' value='bing'>Bing<br>");
		out.print("<input type='radio' name='searchengine' value='duckduckgo'>DuckduckGo<br>");
		
		out.print("<input type='submit'>");
		out.print("<input type='reset'>");
		
		out.print("</form>");
		
		
	}

}
