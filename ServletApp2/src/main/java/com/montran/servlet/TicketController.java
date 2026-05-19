package com.montran.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TicketController")
public class TicketController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String type = request.getParameter("type");

		RequestDispatcher dispatcher;

		switch (type) {
		case "bus":
			dispatcher = request.getRequestDispatcher("WEB-INF/result/busview.jsp");
			dispatcher.forward(request, response);
			break;
		case "train":
			dispatcher = request.getRequestDispatcher("WEB-INF/result/trainview.jsp");
			dispatcher.forward(request, response);

			break;
		case "flight":
			dispatcher = request.getRequestDispatcher("WEB-INF/result/flightview.jsp");
			dispatcher.forward(request, response);
			break;

		default:
			break;
		}

	}

}
