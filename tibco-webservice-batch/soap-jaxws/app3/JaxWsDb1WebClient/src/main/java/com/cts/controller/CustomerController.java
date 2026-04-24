package com.cts.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
        System.out.println("action is "+parameter);

		RequestDispatcher dispatcher;

		PrintWriter out = response.getWriter();

		switch (parameter) {
		case "add":

			String id = request.getParameter("id");

			String name = request.getParameter("name");
			String salary = (request.getParameter("salary"));
			System.out.print("id is  " + id);
			System.out.print("name is  " + name);
			System.out.print("salary is  " + salary);

			if (id.isBlank() || id == null) {
				out.print("id is blank");
				return;
			}

			else if (name.isBlank() || name == null) {
				out.print("name is blank");
				return;
			}

			else if (salary.isBlank() || salary == null) {
				out.print("salary is blank");
				return;
			}

			else
			{
				System.out.println("add record called ");
				dispatcher = request.getRequestDispatcher("addrecord.jsp");
				dispatcher.forward(request, response);
			}
			break;

		case "showall":
			dispatcher = request.getRequestDispatcher("showall.jsp");
			dispatcher.forward(request, response);
			break;

		default:
			break;
		}
	}
}
