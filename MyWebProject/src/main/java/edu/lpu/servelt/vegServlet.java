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
@WebServlet("/vegServlet")
public class vegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("id is "+request.getAttribute("id"));
		out.println("<h2> Veg Items </h2>");
		out.println("<ul>");
		out.println("<li> Dosa ");
		out.println("<li> Idli ");
		out.println("<li> Sambhar ");
		out.println("<li> Roti ");
		out.println("<li> Dal ");
		out.println("<li> Rice ");
		
		out.println("</ul>");
	}


}
