package com.cts;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.model.Login;

@WebServlet("/loginController")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String utype = request.getParameter("utype");
		String id = request.getParameter("id");

		response.getWriter().print("  controller page   ");

		Login login = new Login();
		login.setId(Integer.parseInt(id));
		login.setUtype(utype);

		response.setContentType("text/html");
		
		request.setAttribute("login", login);
		request.setAttribute("country", "India");

		RequestDispatcher dispatcher;

		if (utype.equals("user")) {
			dispatcher = request.getRequestDispatcher("view/user.jsp");
//			dispatcher.forward(request, response);
			dispatcher.include(request, response);
		} else if (utype.equals("admin")) {
			dispatcher = request.getRequestDispatcher("view/admin.jsp");
			dispatcher.forward(request, response);
		}

	}

}
