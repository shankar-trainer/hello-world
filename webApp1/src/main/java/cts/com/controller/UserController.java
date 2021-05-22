package cts.com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cts.com.model.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	int id;
	String password;
	String repassword;
	String name;
	String userType;;

	RequestDispatcher dispatcher;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		id = Integer.parseInt(request.getParameter("id"));

		password = request.getParameter("password");
		repassword = request.getParameter("repassword");
		name = request.getParameter("name");
		userType = request.getParameter("userType");

		User user = new User();

		user.setId(id);
		user.setName(name);

		request.setAttribute("user1", user);

		if (userType.equals("admin")) {
			dispatcher = request.getRequestDispatcher("adminView.jsp");
			dispatcher.forward(request, response);
		}

		else if (userType.equals("user")) {
			dispatcher = request.getRequestDispatcher("userView.jsp");
			dispatcher.forward(request, response);

		}

	}

}
