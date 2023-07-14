package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentDataServlet")
public class StudentDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	Statement st;
	ResultSet rs;

	@Override
	public void init() throws ServletException {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge", "root", "mysql");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			st = connection.createStatement();
			rs = st.executeQuery("select * from student");

			out.println("<table>");
			out.println("<tr><th>Id</th><th>Name</th><th>subject</th><th>Marks</th><th>Dob</th></tr>");
			
			while (rs.next())
				out.println("<tr><td>"+rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getString(3) + "</td><td>" + rs.getFloat(4)
						+ "</td><td>" + rs.getDate(5)+"</td></tr>");

			out.println("</table>");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
