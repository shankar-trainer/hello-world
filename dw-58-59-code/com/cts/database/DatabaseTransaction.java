package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseTransaction {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//
//		Class.forName("com.mysql.jdbc.Driver");
//
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "mysql");

		Connection con = DatabasaUtil.myConnection();

		con.setAutoCommit(false);
		// select query == executeQuery
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter id");
		int id = scanner.nextInt();

		System.out.println("Enter name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter salary");
		float salary = scanner.nextFloat();

		PreparedStatement pst = con.prepareStatement("insert into employee values(?,?,?)");

		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, salary);

		System.out.println("save record y\\n");
		String s = scanner.next();
		if (s.equalsIgnoreCase("y")) {
			int count = pst.executeUpdate();
			con.commit();
			System.out.println(count + " Record Added");
		} else {
			con.rollback();
			System.out.println("record not added");
		}

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee   ");

		ResultSetMetaData metaData = rs.getMetaData();
		for (int i = 1; i <= metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i) + " ");
		}
		System.out.println();

		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));

	}
}
