package com.audintel.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProgram1 {

	public static void main(String[] args) {
		try {
			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());//1st way to
			// load driver
			// 1. register/load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");// 2nd way to load driver
/*			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");*/
			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "mysql");
			// 2. get connection

			if (connection != null)
				System.out.println("connection successful");
			else
				System.out.println("some problem");
			// 3. execute Statement
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from product");

			while (rs.next())// move from beforefirst to next
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));

			// rs.next();
			// System.out.println(rs.getInt(1)+"\t"+rs.getString("prd_name")+"\t"+rs.getFloat(3));
		} catch (SQLException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
