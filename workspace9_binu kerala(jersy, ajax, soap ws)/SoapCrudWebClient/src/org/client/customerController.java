package org.client;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.dao.Customer;
import org.com.dao.CustomerDaoImpl;
import org.com.dao.CustomerDaoImplService;

@WebServlet("/customerController")
public class customerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		String op = request.getParameter("operation");

		CustomerDaoImplService service = new CustomerDaoImplService();

		CustomerDaoImpl dao = service.getCustomerDaoImplPort();
		int id;
		String name;
		float salary;
		Customer customer;
		switch (op) {
		case "Add Customer":
			id = Integer.parseInt(request.getParameter("id"));
			name = request.getParameter("name");
			salary = Float.parseFloat(request.getParameter("salary"));
			customer = null;
			customer = new Customer();
			customer.setId(id);
			customer.setName(name);
			customer.setSalary(salary);
			if (dao.addCustomer(customer))
				out.print("customer added");
			else
				out.print("customer already present");
			break;

		default:
			out.print("wromg button clicked");
			break;
		}

	}

}
