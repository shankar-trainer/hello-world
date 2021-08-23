package edu.abc.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.abc.model.Account;

@WebServlet("/bankingController")
public class bankingController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		String acccount_type = request.getParameter("acttype");
		Account account = new Account();
		int id = Integer.parseInt(request.getParameter("actId"));
		String actName = request.getParameter("actName");
		String actPass = request.getParameter("actPass");

		account.setActId(id);
		account.setActName(actName);
		account.setActPass(actPass);
		account.setActtype(acccount_type);

		request.setAttribute("account", account);

		RequestDispatcher dispatcher;

		switch (acccount_type) {
		case "saving":
			dispatcher = request.getRequestDispatcher("result/saving_account.jsp");
			dispatcher.forward(request, response);
			break;
		case "current":
			dispatcher = request.getRequestDispatcher("result/current_account.jsp");
			dispatcher.forward(request, response);
			break;

		default:
			break;
		}
	}

}
