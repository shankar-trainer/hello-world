package com.cognizant.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
	static Connection con;
	static {
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static Connection retrieveConnection() throws SQLException {
		if (con == null)
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		return con;
	}
}
