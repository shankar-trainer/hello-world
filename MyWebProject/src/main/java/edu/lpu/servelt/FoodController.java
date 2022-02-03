package edu.lpu.servelt;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FoodController")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		request.setAttribute("id",id);

		String foodtype = request.getParameter("food_type");

		RequestDispatcher dispatcher;
		if (foodtype.equals("veg")) {
			dispatcher = request.getRequestDispatcher("vegServlet");
			dispatcher.forward(request, response);
		} else if (foodtype.equals("nonveg")) {
			dispatcher = request.getRequestDispatcher("nonVegServlet");
			dispatcher.forward(request, response);

		} else if (foodtype.equals("chinese")) {
			dispatcher = request.getRequestDispatcher("chineseServlet");
			dispatcher.forward(request, response);

		}
	}

}
