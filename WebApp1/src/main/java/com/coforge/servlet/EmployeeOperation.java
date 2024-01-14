package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/EmployeeOperation")
public class EmployeeOperation extends HttpServlet {

	private static final long serialVersionUID = 1L;

	Connection connection;
	Statement statement;
	ResultSet resultSet;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
//			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
//			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coforge", "root", "mysql");
//			
			
			DataSource dataSource;
			InitialContext context=new InitialContext();
			dataSource=(DataSource) context.lookup("java:comp/env/jdbc/data1");
			
			connection=dataSource.getConnection();
			
			
		} catch ( NamingException | SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String search = request.getParameter("search");
		response.setContentType("text/html");

		if (search.equals("id")) {
			int id = Integer.parseInt(request.getParameter("id"));
			try {
				statement = connection.createStatement();
				resultSet = statement.executeQuery("select * from employee where id=" + id);

				if (resultSet.next()) {
					out.print("Record found for the id " + id);
					out.print("<br>id\tname\tsalary\tdob");
					out.print("<br>" + resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t"+ resultSet.getFloat(3) + "\t" + resultSet.getDate(4));
				} else
					out.print("Record not found for the id " + id);

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		if (search.equals("all")) {

			try {
				statement = connection.createStatement();
				resultSet = statement.executeQuery("select * from employee");

				out.print("<br>id\tname\tsalary\tdob");
				while (resultSet.next()) {
					out.print("<br>" + resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t"
							+ resultSet.getFloat(3) + "\t" + resultSet.getDate(4));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
