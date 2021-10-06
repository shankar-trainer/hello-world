package database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static Connection connection;
	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gl", "root", "mysql");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection retrieveConnection() {
		return connection;
	}
}
