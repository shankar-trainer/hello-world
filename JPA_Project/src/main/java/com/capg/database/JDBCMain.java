package com.capg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain {

	public static void main(String[] args) throws SQLException {
		//load the driver 
		DriverManager.registerDriver(new org.postgresql.Driver());
		// get connection
		
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db4", "postgres", "postgres");
		Statement st=connection.createStatement();
		
		ResultSet rs = st.executeQuery("select * from student");
	
		 while(rs.next()) {
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		 }
	}
}
