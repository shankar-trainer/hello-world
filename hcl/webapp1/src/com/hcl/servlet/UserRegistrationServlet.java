package com.hcl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserRegistrationServlet")
public class UserRegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String dob = request.getParameter("dob");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");

		RequestDispatcher dispatcher;
		
		if(name==null || name.isEmpty() ) {
			dispatcher=request.getRequestDispatcher("UserRegistration.jsp?nameerr=name is empty");
			dispatcher.forward(request, response);
		}
		
		else if(email==null || email.isEmpty() ) {
			dispatcher=request.getRequestDispatcher("UserRegistration.jsp?emailerr=email is empty");
			dispatcher.forward(request, response);
		}
		else if(dob==null || dob.isEmpty() ) {
			dispatcher=request.getRequestDispatcher("UserRegistration.jsp?doberr=dob is empty");
			dispatcher.forward(request, response);
		}
		else if(address==null || address.isEmpty() ) {
			dispatcher=request.getRequestDispatcher("UserRegistration.jsp?addresserr=address is empty");
			dispatcher.forward(request, response);
		}
		else if(phone==null || phone.isEmpty() ) {
			dispatcher=request.getRequestDispatcher("UserRegistration.jsp?phoneerr=phone no is empty");
			dispatcher.forward(request, response);
		}
		else {
			out.print("User data");
		}
	}

}
