package com.audintel.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

import com.audintel.database.util.DatabaseUtil;

public class DatabaseProgram2 {

	public static void main(String[] args) {
		try {
		//	Class.forName("com.mysql.cj.jdbc.Driver");
		//	Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "mysql");
		
			Connection connection =DatabaseUtil.retrieveConnection();	
			Statement statement = connection.createStatement();

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter product id name and cost");
			int id = sc.nextInt();
			String nm = sc.next();
			float cost = sc.nextFloat();
                                       // executeQuery -- select statement
			                           //  executeUpdate -- insert, update,delete
          // statement.executeUpdate("insert into product values(10006,'biscuit',100)");
           int executeUpdate = statement.executeUpdate("insert into product values("+id+",'"+nm+"',"+cost+")");
           System.out.println(executeUpdate+" record added");
           
			ResultSet rs = statement.executeQuery("select * from product");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));

		} 
		 catch (SQLIntegrityConstraintViolationException e) {
			 System.err.println(e.getMessage());
		}
		catch (SQLException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}
}
