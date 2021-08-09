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

public class Program3 {

	Connection connection;
	Statement st;
	ResultSet resultSet;
	Scanner scanner;

	public Program3() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// step1  loading driver
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");// step 2 get connection
		st = connection.createStatement();// step3  get statement object 
		scanner = new Scanner(System.in);
	}

	public void addRecord() throws SQLException {
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

			int r = st.executeUpdate(
					"insert into employee values(" + id + ",'" + name + "'," + salary + ",'" + dob + "')");

			System.out.println(r + " Record Added ");
		} catch (SQLIntegrityConstraintViolationException e) {
			System.err.println(e.getMessage());
		}

	}

	public void showAllRecord() throws SQLException {

		resultSet = st.executeQuery("select * from employee");

		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getFloat("salary")
					+ "  " + resultSet.getDate(4));

	}

	public static void main(String[] args) {

		Program3 program3 = null;
		try {
			program3 = new Program3();
			program3.addRecord();
			program3.showAllRecord();

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				program3.resultSet.close();
				program3.st.close();
				program3.connection.close();

			} catch (SQLException e) {
				System.err.println(e.getMessage());
			}

		}

	}
}
