package com.coforge.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coforge.model.AccountUser;

@WebServlet("/AccountController")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		long accountNo = Long.parseLong(request.getParameter("acccountNo"));
		String acccountUserName = request.getParameter("acccountUserName");
		float acccountBalance = Float.parseFloat(request.getParameter("acccountBalance"));
		String actType = request.getParameter("actType");

		AccountUser accountUser = new AccountUser();

		accountUser.setAcccountNo(accountNo);
		accountUser.setAcccountUserName(acccountUserName);
		accountUser.setAcccountBalance(acccountBalance);
		accountUser.setActType(actType);

		HttpSession session = request.getSession();

		session.setAttribute("account", accountUser);

		RequestDispatcher dispatcher;

		switch (actType) {
		case "saving": {
			dispatcher = request.getRequestDispatcher("view1/savingAccount.jsp");
			dispatcher.forward(request, response);
			break;
		}
		case "current": {
			dispatcher = request.getRequestDispatcher("view1/currentAccount.jsp");
			dispatcher.forward(request, response);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + actType);
		}

	}

}
