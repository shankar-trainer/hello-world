package com.capgemini.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	private static Connection connection;
	static {
		try {
			DriverManager.registerDriver(new org.postgresql.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection myConnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection("jdbc:postgresql://localhost/db1", "postgres", "postgres");

		return connection;
	}
}
