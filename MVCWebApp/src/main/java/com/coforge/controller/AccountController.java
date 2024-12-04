package com.coforge.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coforge.model.Account;

public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		float balance = Float.parseFloat(request.getParameter("balance"));
		String act_type = request.getParameter("act_type");
		
		Account account=new Account();
		account.setId(id);
		account.setName(name);
		account.setBalance(balance);
				
		HttpSession session=request.getSession();
		session.setMaxInactiveInterval(5);
		session.setAttribute("account", account);
		
		session.setAttribute("location","laxminagar");
	
		RequestDispatcher dispatcher;
		
		
		if(act_type.equals("saving")) {
			session.setAttribute("location","laxminagar");
			dispatcher=request.getRequestDispatcher("/SavingAccount.jsp");
			dispatcher.forward(request, response);
		}
		
		if(act_type.equals("current")) {
			session.setAttribute("location","anand vihar");
			dispatcher=request.getRequestDispatcher("/CurrentAccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
		
	}

}
