package com.coforge.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/EmployeeData")
@WebServlet(urlPatterns = "/Hello")
public class EmployeeData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Connection connection;
	Statement st;
	ResultSet rs;
	ResultSetMetaData metaData;
	

	@Override
	public void init() throws ServletException {	
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
out.println("country is "+  getServletConfig().getServletContext().getInitParameter("country"));
		
		response.setContentType("text/html");
		
		out.print("<link rel='stylesheet' type='text/css'  href='css/style1.css'>");
		
		try {
			st = connection.createStatement();
			rs = st.executeQuery("select * from employee");

			metaData=rs.getMetaData();
			int colcount=metaData.getColumnCount();
			
			out.print("<table>");
			out.print("<tr>");
			
			for (int i = 1; i <=colcount; i++) {
				out.print("<th>"+metaData.getColumnName(i)+"</th>");
				
			}
			out.print("</tr>");
			
			
			while (rs.next())
				out.println("<tr><td>" + rs.getInt(1) + "</td><td>" + rs.getString(2) + "</td><td>" + rs.getFloat(3)+"</td></tr>");
			
			out.print("</table>");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
