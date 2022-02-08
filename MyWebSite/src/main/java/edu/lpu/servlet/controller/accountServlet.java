package edu.lpu.servlet.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/accountServlet")
public class accountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int id;

	String accountType;
	String city;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		accountType = request.getParameter("act_type");
		if (accountType == null) {
			out.print("<h2>You have not selected account type</h2>");
			out.print("<br><br><br><br>");
			out.print("<a href='AccountLogin.html'>Login Page</a>");
		} else {
			id = Integer.parseInt(request.getParameter("id"));
			city = request.getParameter("city");

			request.setAttribute("id", id);
			request.setAttribute("city", city);

			RequestDispatcher dispatcher;
			if (accountType.equals("saving")) {
				dispatcher = request.getRequestDispatcher("savingActServlet");
				dispatcher.forward(request, response);
			} else if (accountType.equals("current")) {
				dispatcher = request.getRequestDispatcher("currentActServlet");
				dispatcher.forward(request, response);
			}
		}
	}
}
