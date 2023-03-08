package com.hcl.servlet;

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

@WebServlet("/EmployeeDataServlet")
public class EmployeeDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	Statement st;
	ResultSet rs;
//C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib
	@Override
	public void init() throws ServletException {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			if (connection != null)
				System.out.println("connection successful");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			st=connection.createStatement();
	      rs=  st.executeQuery("select * from employee");
		while(rs.next()) {
			out.print("<br>"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
