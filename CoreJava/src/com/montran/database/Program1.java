package com.montran.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) throws SQLException {

		// Driver arg0=new com.mysql.cj.jdbc.Driver();

//		DriverManager.registerDriver(arg0);
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection
		// ("jdbc:mysql://localhost:3306/montran", "root","mysql");
		("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");
		if (connection != null)
			System.out.println("connection successful");
		else
			System.out.println("some problem");

		Statement statement = connection.createStatement();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Id");
		int id = scanner.nextInt();

		System.out.println("Enter Name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter Salary");
		float salary = scanner.nextFloat();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter dob in dd-MM-yyyy format");
		String s = scanner.next();
		Date date = null;
		try {
			date = dateFormat.parse(s);
		} catch (ParseException e) {
			System.err.println("date format error " + e.getMessage());
		}
		
		java.sql.Date dob = new java.sql.Date(date.getTime());
		try {
			int r = statement.executeUpdate(
					"insert into employee values(" + id + ",'" + name + "'," + salary + ",'" + dob + "')");

			System.out.println(r + " Record Added ");
		} catch (SQLIntegrityConstraintViolationException e) {
			System.err.println(e.getMessage());
		}
		ResultSet resultSet = statement.executeQuery("select * from employee");

		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getFloat("salary")
					+ "  " + resultSet.getDate(4));

	}
}
