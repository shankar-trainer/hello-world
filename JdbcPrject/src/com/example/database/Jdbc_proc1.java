package com.example.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Jdbc_proc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/montran", "root", "mysql");

		CallableStatement statement = connection.prepareCall("{call emp_avg_salary}");

		ResultSet rs = statement.executeQuery();
		rs.next();

		System.out.println("employee average salary is " + rs.getFloat(1));
		

		statement = connection.prepareCall("{call emp_update_salary}");

		statement.executeUpdate();
		System.out.println("record  updated");


		// emp_avg_salary

	}
}
