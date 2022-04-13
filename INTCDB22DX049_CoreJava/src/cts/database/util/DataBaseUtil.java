package cts.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {

	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	static Connection connection;

	public static Connection myConnection() throws SQLException {
		if (connection == null)
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");
		return connection;

	}

}
