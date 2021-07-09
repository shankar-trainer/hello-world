package com.cts.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseIUtil {

	private static Connection connection;
	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection getMyConnection() throws SQLException {
		if (connection == null)
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db3", "root", "mysql");
		else
			return null;
	}

}
