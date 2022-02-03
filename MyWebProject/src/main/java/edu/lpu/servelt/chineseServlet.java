package edu.lpu.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class vegServlet
 */
@WebServlet("/chineseServlet")
public class chineseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("id is "+request.getAttribute("id"));
		out.println("<h2> Chinese Food  Items </h2>");
		out.println("<ul>");
		out.println("<li> Chilli potato ");
		out.println("<li> Pasta ");
		out.println("<li> Chowmein ");
		out.println("<li> Hakka Noodle ");
		out.println("<li> Momos ");
		
		out.println("</ul>");
	}


}
