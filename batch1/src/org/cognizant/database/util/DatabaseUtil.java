package org.cognizant.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {

	static Connection con;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection myConnection() throws SQLException {
		if(con==null)
			con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db1", "root", "mysql");
		return con;
	}
	
}
