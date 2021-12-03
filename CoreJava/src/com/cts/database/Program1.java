package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1st step loading the driver
		// 1st way
		// Class.forName("oracle.jdbc.OracleDriver");//1st way to load driver
		// 2nd way
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		// 2nd step -- get connection

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		if (connection != null)
			System.out.println("connection successful " + connection);
		else
			System.out.println("some problem");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		int id = sc.nextInt();

		System.out.println("Enter name ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter salary ");
		float salary = sc.nextFloat();

		System.out.println("Enter Location ");
		String location = sc.next();

		Statement st = connection.createStatement();
		int executeUpdate = st
			.executeUpdate("insert into employee values(" + id + ",'" + name + "'," + salary + ",'" + location + "')");
		System.out.println(executeUpdate + " Record added");

		ResultSet rs = st.executeQuery("select * from employee");

		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));

	}
}
