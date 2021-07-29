package com.montran.database;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Program2 {

public static void main(String[] args) throws SQLException {
		
	//	Driver arg0=new org.mariadb.jdbc.Driver();
		
//		DriverManager.registerDriver(arg0);
//		DriverManager.registerDriver(new org.mariadb.jdbc.Driver());
		Connection connection = DriverManager.getConnection
				("jdbc:mariadb://localhost:3306/montran", "root","mysql");
		if(connection!=null)
			System.out.println("connection successful");
		else
			System.out.println("some problem");
 }	
}
