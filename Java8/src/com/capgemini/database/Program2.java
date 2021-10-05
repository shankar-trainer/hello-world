package com.capgemini.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.capgemini.database.util.DatabaseUtil;

public class Program2 {

	public static void main(String[] args) {

		try {
			// step1 load the driver
			// 1st way
			// DriverManager.registerDriver(new org.postgresql.Driver());
			// 2nd way

			// Class.forName("org.postgresql.Driver");
			// DriverManager.getConnection("jdbc:postgresql://localhost/db1","postgres","postgres");

			// autoloading of driver
			
//			Connection connection = DriverManager.getConnection("jdbc:postgresql://127.0.0.1/db1", "postgres",	"postgres");
			// getConnection(url,uname,pass)
		//	Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db1?user=postgres&password=postgres&ssl=false");
			Connection connection=DatabaseUtil.myConnection();	
			if (connection != null)
				System.out.println("connection successful");
			else
				System.out.println("connection problem");

			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from customer");
			
			while(rs.next())
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));
			
/*
			rs.next();
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));
			
			System.out.println(rs.getInt(1) + "\t" + rs.getString("name") + " \t" + rs.getString("location"));

			rs.next();

			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));
*/
			
			st.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		catch (ClassNotFoundException e) {
//			
//		}
	}
}
