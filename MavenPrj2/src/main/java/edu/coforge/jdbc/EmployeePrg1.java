package edu.coforge.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeePrg1 {

	public static void main(String[] args) throws SQLException {

		// 1.Load the driver
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

		// 2.get connection
		// localhost -- ip 127.0.0.1

		Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/coforge", "root", "mysql");
		if (connection != null)
			System.out.println("connection successful");
		else
			System.out.println("some problem");

		Statement st = connection.createStatement();
		// ResultSet is present at beforeFirst position, no record
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter roll");
		int roll=scanner.nextInt();
		
		System.out.println("Enter name");
		scanner.nextLine();
		
		String name=scanner.nextLine();
		
		System.out.println("Enter Location");
		String location=scanner.nextLine();

		int x=st.executeUpdate("insert into student values("+roll+",'"+name+"','"+location+"')");

		System.out.println(x+" Record added");
		
		ResultSet rs = st.executeQuery("select * from student");
		
		while (rs.next())

			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
 

	}
}
