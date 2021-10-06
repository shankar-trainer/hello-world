package com.capgemini.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program_mysql {

	public static void main(String[] args) throws SQLException {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/db2", "root", "mysql");

		if (connection != null)
			System.out.println("connection is successful");
		else
			System.out.println("some problem");

		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from customer");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));
		}

		System.out.println("---------- procedure calling ");

		System.out.println("Enter id to search ");
		int id = new Scanner(System.in).nextInt();

		CallableStatement cst = connection.prepareCall("{call CustomerSearch(?,?,?)}");
		cst.setInt(1, id);
		
		cst.registerOutParameter(2, java.sql.Types.VARCHAR);
		cst.registerOutParameter(3, java.sql.Types.VARCHAR);
		
		cst.execute();
		
		if(cst.getString(2)!=null) {
			System.out.println("found record for id "+id);
			System.out.println(cst.getString(2)+"  "+cst.getString(3));
		}
		else 
			System.out.println("not found record for id "+id);
		
		

	}
}
