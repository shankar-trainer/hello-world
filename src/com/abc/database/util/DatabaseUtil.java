package com.abc.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	static Connection connection;

	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		}
	}

	public static Connection myConnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/inventory", "root", "mysql");// step 2
		return connection;
	}

}
