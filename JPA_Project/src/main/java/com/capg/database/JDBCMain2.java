package com.capg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCMain2 {

	public static void main(String[] args)  {
		try {
		//load the driver 
		DriverManager.registerDriver(new org.postgresql.Driver());
		// get connection
		
		Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db4", "postgres", "postgres");
		Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		
		
		ResultSet rs = st.executeQuery("select * from student");
	
		rs.afterLast();
		
		 while(rs.previous()) {
			 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
		 }
		 
		}
		catch(SQLException e) {
			System.err.println(e);
		}
	}
}
