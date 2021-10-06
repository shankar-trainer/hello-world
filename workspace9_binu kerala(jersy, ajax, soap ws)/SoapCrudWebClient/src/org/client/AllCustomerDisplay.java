package org.client;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.dao.Customer;
import org.com.dao.CustomerDaoImpl;
import org.com.dao.CustomerDaoImplService;

@WebServlet("/AllCustomerDisplay")
public class AllCustomerDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		response.setContentType("text/html");
		CustomerDaoImplService service = new CustomerDaoImplService();

		CustomerDaoImpl dao = service.getCustomerDaoImplPort();

		List<Customer> showAllCustomer = dao.showAllCustomer();
		out.print("<style> body{background:pink;} table{ margin-left:300px; margin-top:50px; width:50%;padding:2px;} </style>");
		
		out.print("<table border='1' bgcolor='yellow' color='blue'>");
		
     out.println("<tr><th>Id</th>  <th>Name</th> <th>Salary</th></tr>");
		for (Customer customer : showAllCustomer) {
			out.print("<tr><td>"+customer.getId() + " </td><td> " + customer.getName() + "</td><td> " + customer.getSalary() + "</td></tr>");
		}
		out.print("</table>");
	}
}
