package edu.lpu.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ControllerServlet
 */
@WebServlet("/ControllerServlet")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String account_type = request.getParameter("act_type");
		response.setContentType("text/html");
		if (account_type == null) {
			out.print("<h2>you have  not selected any type</h2>");
			out.print("<a href='BankAccount.html'>Logn Again</a>");

		} else {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");

			request.setAttribute("id", id);
			request.setAttribute("name", name);

			RequestDispatcher dispatcher;

			if (account_type.equals("saving")) {
				dispatcher = request.getRequestDispatcher("/savingActServlet");
				dispatcher.forward(request, response);
			} else if (account_type.equals("current")) {
				dispatcher = request.getRequestDispatcher("/currentActServlet");
				dispatcher.forward(request, response);

			}
		}

	}

}
