package com.cts.database;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.Scanner;

public class DatabaseDemo2 {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new org.h2.Driver());

		Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

		if (connection != null)
			System.out.println("connection successfull");
		else
			System.out.println("some problem");
		

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

		PreparedStatement pst = connection.prepareStatement("insert into student values (?,?,?,?) ");

		pst.setInt(1, roll);
		pst.setString(2, name);
		pst.setString(3, subject);
		pst.setFloat(4, marks);

		int res = pst.executeUpdate();

		if (res == 1)
			System.out.println("Record Added");

		ResultSet rs = st.executeQuery("select * from student");

		ResultSetMetaData metaData = rs.getMetaData();

		int colNo = metaData.getColumnCount();

		for (int i = 1; i <= colNo; i++) {
			System.out.print(metaData.getColumnName(i) + "  ");
		}

		while (rs.next())

			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getFloat(4));

	}

}
