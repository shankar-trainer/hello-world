package org.tvscreditserviceltd.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	static Connection connection;

	static {
		// Class.forName(className)
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection myConnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db1", "root", "");
		return connection;
	}
}
