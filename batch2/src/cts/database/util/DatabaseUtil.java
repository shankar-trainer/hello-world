package cts.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static Connection connection;
	static {
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	public static Connection MyConnection() throws SQLException {
		if(connection==null)
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db2", "root", "mysql");
		
		return connection;
	}
	
}
