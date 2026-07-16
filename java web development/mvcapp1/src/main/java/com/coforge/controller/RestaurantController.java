package com.coforge.controller;

import java.io.IOException;

import com.coforge.model.Restaurant;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/RestaurantController")
public class RestaurantController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String type = request.getParameter("type");

		Restaurant restaurant = new Restaurant();
		restaurant.setId(id);
		restaurant.setName(name);
		restaurant.setType(type);

		session.setAttribute("restaurant", restaurant);

		RequestDispatcher dispatcher;
		switch (type) {
		case "sindian":
			dispatcher = request.getRequestDispatcher("result/sindian.jsp");
			dispatcher.forward(request, response);

			break;

		case "nindian":
			dispatcher = request.getRequestDispatcher("result/nindian.jsp");
			dispatcher.forward(request, response);

			break;

		case "chinese":
			dispatcher = request.getRequestDispatcher("result/chinese.jsp");
			dispatcher.forward(request, response);

			break;

		default:
			break;
		}

	}

}
