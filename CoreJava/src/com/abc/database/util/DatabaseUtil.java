package com.abc.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static Connection connection;
	static {
		try {
			//Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch ( SQLException e) {
			e.printStackTrace();
		}
	}

	
	public static Connection myDatabaseConnection() throws SQLException {
		if(connection==null)
			connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "");
		return connection;
	}
}
