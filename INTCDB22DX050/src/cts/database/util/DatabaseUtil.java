package cts.database.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
static Connection connection;
static {
	try {
		DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

public static Connection myConnection() throws SQLException {
	
	if(connection==null) {
	connection = DriverManager.getConnection("Jdbc:mysql://localhost:3306/db1","root","mysql");
	}
	return connection;
}
}
