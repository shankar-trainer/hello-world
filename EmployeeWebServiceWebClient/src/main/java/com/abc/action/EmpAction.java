package com.abc.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.abc.model.Employee;
import com.abc.webservice.EmployeeService;

@WebServlet("/EmpAction")
public class EmpAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String operation = request.getParameter("operation");

		URL url = new URL("http://localhost:8080/EmployeeWebservice/hello?WSDL");
		QName name = new QName("http://webservice.abc.com/", "EmployeeServiceImplService");

		Service service = Service.create(url, name);

		EmployeeService service1 = service.getPort(EmployeeService.class);
		response.setContentType("text/html");
		switch (operation) {
		case "GetAll":
			try {
				List<Employee> employeeList = service1.getEmployeeList();
				out.print("<table border='1' align='center'>");
				out.print("<tr><th>Id</th><th>Name</th><th>Salary</th><th>City</th></tr>");

				for (Employee e : employeeList) {
					out.print("<tr>");
					out.print("<td>" + e.getId() + "</td>");
					out.print("<td>" + e.getName() + "</td>");
					out.print("<td>" + e.getSalary() + "</td>");
					out.print("<td>" + e.getCity() + "</td>");
					out.print("</tr>");
				}
				out.print("</table>");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			break;
		case "Find":
			try {
				int id = Integer.parseInt(request.getParameter("id"));
				Employee searchEmployee = service1.searchEmployee(id);
				if (searchEmployee == null)
					out.print("Employee Not found ");
				else {
					out.print("Employee Found <br>");
					out.print("<table border='1' align='center'>");
					out.print("<tr><th>Id</th><th>Name</th><th>Salary</th><th>City</th></tr>");
					out.print("<tr>");
					out.print("<td>" + searchEmployee.getId() + "</td>");
					out.print("<td>" + searchEmployee.getName() + "</td>");
					out.print("<td>" + searchEmployee.getSalary() + "</td>");
					out.print("<td>" + searchEmployee.getCity() + "</td>");
					out.print("</tr>");
					out.print("<table>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		default:
			break;
		}
	}
}
