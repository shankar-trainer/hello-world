package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcPrg2 {

	public static void main(String[] args) {
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			DriverManager.registerDriver(new org.h2.Driver());
			
			Connection connection1 = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/montran", "root", "mysql");
			
			
			if(connection1!=null)
				System.out.println("connection1 successful");
			else
				System.out.println("some problem in connection 1");
			Statement st1=connection1.createStatement();
			
			st1.execute("desc employee");
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
