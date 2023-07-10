package com.coforge.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePrg1 {

	public static void main(String[] args) throws SQLException {
		
		//1.load the driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		//2.get connection
		Connection connection = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/coforge","root","mysql");
		if(connection!=null)
			System.out.println("connection successful");
		else
			System.out.println("connection problem");
			
		//3.get statement 
		Statement st = connection.createStatement();
		
		//4. execute query 
		ResultSet rs = st.executeQuery("select * from student");
		
		while(rs.next())
		
	 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4)+"\t"+rs.getDate(5));	
		
	 
	}
}
