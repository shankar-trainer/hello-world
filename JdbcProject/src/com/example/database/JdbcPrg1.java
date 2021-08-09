package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcPrg1 {

	public static void main(String[] args) {
		
		try {
			//1. load the driver 
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			DriverManager.registerDriver(new org.h2.Driver());
			
			//2. get connection
			Connection connection1 = DriverManager.getConnection
					("jdbc:mysql://localhost:3306/montran", "root", "mysql");
			
			Connection connection2 = DriverManager.getConnection
					("jdbc:h2:mem:testdb", "sa", "");
			
			if(connection1!=null)
				System.out.println("connection1 successful");
			else
				System.out.println("some problem in connection 1");
			
			if(connection2!=null)
				System.out.println("connection2 successful");
			else
				System.out.println("some problem in connection2");
			
			
			//3 get statement 
			Statement st1=connection1.createStatement();
			//4.execute the sql query 
			ResultSet rs1 = st1.executeQuery("select * from employee");
			
			while(rs1.next())
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+" "+rs1.getFloat(3)+"  "+rs1.getDate(4));
			
/*			rs1.next();
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+" "+rs1.getFloat(3)+"  "+rs1.getDate(4));
			
			rs1.next();
			System.out.println(rs1.getInt(1)+"  "+rs1.getString(2)+" "+rs1.getFloat("salary")+"  "+rs1.getDate("dob"));
	*/		
			rs1=null;
			 rs1 = st1.executeQuery("select count(*) from employee");
			rs1.next();
			System.out.println("no of record is "+rs1.getInt(1));
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
