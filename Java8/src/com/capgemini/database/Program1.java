package com.capgemini.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) throws SQLException {

		// step1 load the driver
		DriverManager.registerDriver(new org.postgresql.Driver());
		// step2 get connection
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db1", "postgres", "postgres");

		if (connection != null)
			System.out.println("connection successful");
		else
			System.out.println("connection failure");

		Statement st = connection.createStatement();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id ");
		int id = scanner.nextInt();

		System.out.println("Enter name ");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter location ");
		String location = scanner.next();
		//st.executeUpdate("insert into customer (id,name,location) values(10012,'ram kumar','chennai')");
		int executeUpdate = st.executeUpdate("insert into customer (id,name,location) values("+id+",'"+name+"','"+location+"')");
		if(executeUpdate==1)
			System.out.println("1 record added");
		
		ResultSet rs = st.executeQuery("select * from customer");

		// rs.next();
		// System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		// rs.next();
		// System.out.println(rs.getInt(1)+"\t"+rs.getString("name")+"\t"+rs.getString("location"));

		ResultSetMetaData meta = rs.getMetaData();
		int count = meta.getColumnCount();
		for (int i = 1; i <= count; i++) {
			System.out.print(meta.getColumnName(i) + "\t");
		}

		System.out.println();
		while (rs.next())
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));

	}
}
