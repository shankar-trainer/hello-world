package com.coforge.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.coforge.model.Employee;

@WebServlet("/EmployeeController")
public class EmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("empId"));
		String name = request.getParameter("empName");
		String pass = request.getParameter("empPass");
		String type = request.getParameter("type");
		
		Employee employee=new Employee();
		employee.setEmpId(id);
		employee.setEmpName(name);
		employee.setEmpPass(pass);
		employee.setType(type);
		
		HttpSession session=request.getSession();
		session.setAttribute("employee", employee);
		
		RequestDispatcher dispatcher;
		
		switch (type) {
		case "Software Department": {
		     dispatcher=request.getRequestDispatcher("developer.jsp");
		     dispatcher.forward(request, response);
			break;
		}
		case "Management Department": {
			dispatcher=request.getRequestDispatcher("management.jsp");
			dispatcher.forward(request, response);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}

	}

}
