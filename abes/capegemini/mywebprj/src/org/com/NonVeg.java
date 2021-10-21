package org.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NonVeg")
public class NonVeg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.print("<style>");
out.print(".style1{border:double 10px blue;"
		+ "width:35%;color:blue;background:yellow;"
		+ "margin-left:300px; }");
		
		out.print("</style>");
		
		String id = request.getParameter("uid");
		String name = request.getParameter("name");

		out.print("<div class='style1'>");
		out.print("<h1>Welcome to  Non Vegetarian Page</h1>");
		out.print("<br>Id is " + id);
		out.print("<br>Name is " + name);
		out.print("<br><h2>We serve following products </h2> ");
		
		out.print("<ul>");
		out.print("<li>Chilly Paneer</li>");
		out.print("<li>Palak Paneer</li>");
		out.print("<li>Chana Masala</li>");
		out.print("<li>Soya Chap</li>");
		out.print("<li>Masroom Chap</li>");
		out.print("<li>Veg Biryani</li>");

		out.print("</ul>");
		out.print("</div>");

	}

}
