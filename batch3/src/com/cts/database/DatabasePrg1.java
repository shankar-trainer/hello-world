package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class DatabasePrg1 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db3", "root", "mysql");
			if (connection != null)
				System.out.println("connection is successful");
			//Statement st = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
			
			Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			
			Scanner scanner=new Scanner(System.in);
			int isbn;
			String bname,author;
			float cost;
			System.out.println("Enter isbn");
			isbn=scanner.nextInt();
			
			System.out.println("Enter book name");
			scanner.nextLine();
			bname=scanner.nextLine();
			
			System.out.println("Enter author");
			author=scanner.nextLine();
			
			System.out.println("Enter cost");
			cost=scanner.nextFloat();
			
			int res=st.executeUpdate("insert into book values("+isbn+",'"+bname+"','"+author+"',"+cost+")");
			System.out.println(res+" Record added");
			
			ResultSet rs = st.executeQuery("select  * from book");

			while (rs.next())
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getFloat(4));

			System.out.println("reverse order");

			while (rs.previous())
				System.out.println(
						rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3) + "  " + rs.getFloat(4));

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// cts_db3
}
