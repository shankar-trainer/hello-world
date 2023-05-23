package edu.chitkara.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcProgram1 {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		Connection connection = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/chitkara","root","mysql");
		if(connection!=null)
			System.out.println("connection established");
		else 
			System.out.println("some problem");
	}
	
	
}
