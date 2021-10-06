package org.com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RestaurantController")
public class RestaurantController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String type = request.getParameter("order_type");

		// out.print("<h1>Controller page</h1>");

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		RequestDispatcher dispatcher;
		
		request.setAttribute("country", "india");

		if (id.isEmpty() || name.isEmpty()) {
			out.print("<center><font color='blue' size='15px'>either id or name is empty</font></center>");
			dispatcher = request.getRequestDispatcher("Restaurant.html");
			dispatcher.include(request, response);
		}

		else {
			if (type==null) {
				out.print("<center><font color='blue' size='15px'>Select Type </font></center>");
				dispatcher = request.getRequestDispatcher("Restaurant.html");
				dispatcher.include(request, response);

			} else {
				switch (type) {
				case "veg":
					dispatcher = request.getRequestDispatcher("/restaurant/resaturant_veg.jsp");
					dispatcher.forward(request, response);

					break;
				case "non-veg":
					dispatcher = request.getRequestDispatcher("/restaurant/resaturant_non-veg.jsp");
					dispatcher.include(request, response);
					break;

				default:

					break;
				}
			}
		}

	}
}
