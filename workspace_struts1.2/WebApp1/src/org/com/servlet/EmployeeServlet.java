package org.com.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.com.model.Employee;

public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String driver;
	String url;
	String uname;
	String pass;
	Connection connection;
	Statement st;
	ResultSet rs;
  ServletContext ctx;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		ctx=config.getServletContext();
		
		driver = ctx.getInitParameter("driver");
		url = ctx.getInitParameter("url");
		uname = ctx.getInitParameter("user");
		pass = ctx.getInitParameter("password");
		ctx.setAttribute("product1", "tv");
		ctx.setAttribute("price", 12000.00f);
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, uname, pass);
			if(connection==null)
				System.out.println("connection is null");
		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e);
		}
	}

	public List<Employee> getAllEmployeeRecord() throws SQLException {
		List<Employee> empList = null;
		empList = new ArrayList<Employee>();
		Employee emp;
		st = connection.createStatement();
		rs = st.executeQuery("select * from employee");

		while (rs.next()) {
			emp = null;
			emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			empList.add(emp);
		}
		return empList;
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<table border='1' bgcolor='lightyellow' width='40%'>");
		try {
			for (Employee e : getAllEmployeeRecord()) {
				out.println("<tr><td>" + e.getId() + "</td><td>" + e.getName()
						+ "</td><td>" + e.getSalary() + "</td></tr>");
			}
			out.println("</table>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
