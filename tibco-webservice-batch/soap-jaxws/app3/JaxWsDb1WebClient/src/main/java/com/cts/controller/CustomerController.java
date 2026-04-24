package com.cts.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String parameter = request.getParameter("submit");

		RequestDispatcher dispatcher;
		

		switch (parameter) {
		case "add":
			System.out.println();
			dispatcher = request.getRequestDispatcher("addrecord.jsp");
			dispatcher.forward(request, response);
			break;

		case "showall":
			System.out.println("show all will called ");
			dispatcher = request.getRequestDispatcher("showall.jsp");
			dispatcher.forward(request, response);
			break;

		default:
			break;
		}

	}

}
