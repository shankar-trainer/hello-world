package com.coforge.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

	static Connection connection;
	static {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection userConnection() throws SQLException {
		if(connection==null) {
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
		}
		return connection;
	}
}
// create table employee(id int primary key, name varchar(20), salary float(10,2));