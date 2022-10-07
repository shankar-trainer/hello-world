package com.montran.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.montran.dao.EmployeeDao;
import com.montran.model.Employee;

@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDao dao;
	Employee employee;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			dao = new EmployeeDao();
			String operation = request.getParameter("operation");
			switch (operation) {
			case "ShowAll":
				out.print("<h1>Employee Record</h1>");
				List<Employee> allEmloyee = dao.getAllEmloyee();
				for (Employee employee : allEmloyee) {
					out.print(employee.getEmpId() + "  " + employee.getEmpName() + "  " + employee.getEmpSalary()
							+ "   " + employee.getEmpDob() + "<br>");
				}
				break;

			case "Add Record":
				employee=new Employee();
				employee.setEmpId(Integer.parseInt(request.getParameter("empid")));
				employee.setEmpName(request.getParameter("empname"));
				employee.setEmpSalary(Float.parseFloat(request.getParameter("empsalary")));
				System.out.println("dob is "+request.getParameter("empdob"));
				
				String dob1=request.getParameter("empdob");
				//2016-12-08
				String ar[]=dob1.split("-");
				Date date=new Date(new Integer(ar[0]),new Integer(ar[1]), new Integer(ar[2]));
				
				employee.setEmpDob(date);
				
				if(dao.addEmployee(employee))
					out.print("Employee Added");
				else 
					out.print("Employee already Present");
				
				break;
				
			default:
				break;
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
