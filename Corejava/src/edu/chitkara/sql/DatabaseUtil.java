package edu.chitkara.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static Connection connection;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static Connection myConnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chitkara", "root", "mysql");
		return connection;
	}
}
