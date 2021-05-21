package com.cts.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.Scanner;

public class DatabaseDemo1 {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbaj06", "root", "mysql");

		/*
		 * if (connection != null) System.out.println("connection successfull"); else
		 * System.out.println("some problem");
		 * 
		 * Optional<Connection> optional = Optional.ofNullable(connection);
		 * 
		 * if (optional.isPresent()) System.out.println("connection succressful...");
		 * else System.out.println("some problem ");
		 * 
		 */

		int roll;
		String name, subject;
		float marks;

		Scanner sc = new Scanner(System.in);

		Statement st = connection.createStatement();

		System.out.println("Enter roll");
		roll = sc.nextInt();

		System.out.println("Enter Name");
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Enter Subject");
		subject = sc.next();

		System.out.println("Enter marks");
		marks = sc.nextFloat();

		int res = st.executeUpdate(
				"insert into student values(" + roll + ",'" + name + "','" + subject + "'," + marks + ")");
		if (res == 1)
			System.out.println("Record Added");

		ResultSet rs = st.executeQuery("select * from student");

		ResultSetMetaData metaData=rs.getMetaData();
		
		int colNo=metaData.getColumnCount();
		
		for (int i = 1; i <=colNo; i++) {
			System.out.print(metaData.getColumnName(i)+"  ");
		}
		System.out.println();
		
		DatabaseMetaData databaseMetaData=connection.getMetaData();
		
		System.out.println("driver name"+databaseMetaData.getDriverName());
		System.out.println("database name  "+databaseMetaData.getDatabaseProductName());
		System.out.println("url  name  "+databaseMetaData.getURL());
		System.out.println("user  name  "+databaseMetaData.getUserName());
		
		
		
		while (rs.next())

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getFloat(4));
	}

}
