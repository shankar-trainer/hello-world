package com.nec.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());// load the driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nec", "root", "");

			if (connection != null)
				System.out.println("connection successful");
			else
				System.out.println("some problem");
              												//default value
	//		Statement statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY); 
			Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			/*
			 * rs.next(); System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" +
			 * rs.getFloat(3)); rs.next(); System.out.println(rs.getInt("eid") + "\t" +
			 * rs.getString("name") + "\t" + rs.getFloat("salary"));
			 */

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id ");
			int id = scanner.nextInt();

			System.out.println("Enter name ");
			scanner.nextLine();
			String name = scanner.nextLine();

			System.out.println("Enter Salary ");
			float salary = scanner.nextFloat();

			try {
int x = statement.executeUpdate("insert into employee values(" + id + ",'" + name + "'," + salary + ")");
			if (x == 1)
				System.out.println("Record added ");
			}
			catch (SQLIntegrityConstraintViolationException e) {
				//System.err.println(e);
				System.err.println(e.getMessage());
			}
			ResultSet rs = statement.executeQuery("select * from employee");

			System.out.println("All Records ");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
			
			System.out.println("All Records in Reverse Order ");
   
			rs.afterLast();
			
			while (rs.previous())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
