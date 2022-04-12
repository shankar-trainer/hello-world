package com.cts.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static Connection con;

	public static Connection myConnection() throws SQLException {
		if (con == null)
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2 ", "root", "mysql");
		return con;
	}
}
