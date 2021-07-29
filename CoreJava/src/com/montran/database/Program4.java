package com.montran.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Program4 {

	Connection connection;
	Statement st;
	PreparedStatement pst;
	ResultSet resultSet;
	Scanner scanner;
	CallableStatement callableStatement;
	ResultSetMetaData metaData;

	public Program4() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");// step1 loading driver
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");// step 2 get
		connection.setAutoCommit(false);

		st = connection.createStatement();// step3 get statement object
		scanner = new Scanner(System.in);
	}

	public void showAllRecord() throws SQLException {
		resultSet = st.executeQuery("select * from employee");
		metaData = resultSet.getMetaData();
		for (int i = 1; i <= metaData.getColumnCount(); i++)
			System.out.print(metaData.getColumnName(i) + "\t");

		System.out.println("\n");
		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "\t" + resultSet.getString(2) + "\t" + resultSet.getFloat("salary")
					+ "  " + resultSet.getDate(4));
	}

	public void searchRecord(int id) throws SQLException {
		callableStatement = connection.prepareCall("{call emp_search1(?,?,?)}");
		callableStatement.setInt(1, id);
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.registerOutParameter(3, java.sql.Types.FLOAT);

		if (!callableStatement.execute()) {
			System.out.println("Record found  with id " + id);
			System.out.println("name is " + callableStatement.getString(2));
			System.out.println("salary is " + callableStatement.getFloat(3));
		} else
			System.out.println("Record not found with id  " + id);
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
			pst = connection.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, salary);
			pst.setDate(4, dob);

			int r = pst.executeUpdate();

			System.out.println("Commit for add Record y\\n ");
			if (scanner.next().equalsIgnoreCase("y")) {
				connection.commit();
				System.out.println(r + " Record Added ");
			} else {
				connection.rollback();
				System.out.println("Record not added");
			}
		} catch (SQLIntegrityConstraintViolationException e) {
			System.err.println(e.getMessage());
		}

	}

	public static void main(String[] args) {

		Program4 program3 = null;
		try {
			program3 = new Program4();
			program3.addRecord();
			program3.showAllRecord();
			// program3.searchRecord(8003);

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
