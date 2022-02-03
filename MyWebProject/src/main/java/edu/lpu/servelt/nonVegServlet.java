package edu.lpu.servelt;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/nonVegServlet")
public class nonVegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.print("id is "+request.getAttribute("id"));
		out.println("<h2> Non Veg Items </h2>");
		out.println("<ul>");
		out.println("<li> Chicken Gravy ");
		out.println("<li> Chicken Biryani ");
		out.println("<li> Chicken Tikka ");
		out.println("<li> Mutton Kabab ");
		out.println("<li> Mutton Istu ");
		
		out.println("</ul>");
	}


}
