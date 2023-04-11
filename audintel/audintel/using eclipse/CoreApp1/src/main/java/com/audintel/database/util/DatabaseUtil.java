package com.audintel.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *  
 * @author shankar
 *  This is database utility file
 */
public class DatabaseUtil {

	private DatabaseUtil() {
	}

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	private static Connection connection;
     /**
      * It gives singleton connection
      * 
      * @return
      * @throws SQLException
      */
	public static Connection retrieveConnection() throws SQLException {
		if (connection == null) {
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "mysql");
		}
		return connection;
	}
}
