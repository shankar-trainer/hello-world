package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseEx1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		//DriverManager.registerDriver(new com.mysql.jdbc.Driver());
 
		Class.forName("com.mysql.jdbc.Driver");
		// above -- load driver

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "mysql");

		if (con != null)
			System.out.println("connection successful");
		else
			System.out.println("some problem");
		Statement st = con.createStatement();

		// insert record
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = scanner.nextInt();

		System.out.println("Enter name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter salary");
		float salary = scanner.nextFloat();

		int count = st.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");
		System.out.println(count+" Record Added");
		// executeUpdate -- insert, update , delete
		
		ResultSet rs = st.executeQuery("select * from employee   ");
                         // select query == executeQuery
		
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));

	}
}
