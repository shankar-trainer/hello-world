package com.capg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program_mysql {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db2", "root", "mysql");

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));
		}
	}
}
