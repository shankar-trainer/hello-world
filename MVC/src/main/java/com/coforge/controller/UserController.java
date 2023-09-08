package com.coforge.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.coforge.model.User;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
           int id=Integer.parseInt(request.getParameter("id"));
           String name=request.getParameter("name");
           float salary=Float.parseFloat(request.getParameter("salary"));
           String type=request.getParameter("type");
           
           
           User user=new User();
           user.setId(id);
           user.setName(name);
           user.setSalary(salary);
           user.setType(type);
           
           request.getSession().setAttribute("user", user);
           request.getSession().setMaxInactiveInterval(15);
           
           RequestDispatcher dispatcher;
           
           switch (type) {
		case "homeloan": {
			dispatcher=request.getRequestDispatcher("page/homeloan.jsp");
			dispatcher.forward(request, response);
			break;
		}
		case "personalloan": {
			dispatcher=request.getRequestDispatcher("page/personalloan.jsp");
			dispatcher.forward(request, response);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}

}
