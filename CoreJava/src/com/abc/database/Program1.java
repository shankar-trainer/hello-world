package com.abc.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//1st step loading 
		  //1st way to load driver 
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		 //2nd way to load driver 
		  Class.forName("com.mysql.cj.jdbc.Driver");
		//1 DriverManage.register Driver
		
		//2. get connection
		 Connection connnection=  DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root","");
        //3rd get statement object
		 
		 Statement createStatement = connnection.createStatement();
		 
		 ResultSet rs = createStatement.executeQuery("select * from  book");
		 
		 
		 while(rs.next())
		 System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
		 
	}
}
