package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseEx2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "mysql");

		Statement st = con.createStatement();

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter id");
		int id = scanner.nextInt();

		System.out.println("Enter name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter salary");
		float salary = scanner.nextFloat();

		//PreparedStatement pst=con.prepareStatement("insert into employee values("+id+",'"+name+"',"+salary+")");
		PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?)");
		
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, salary);
				
		int count=pst.executeUpdate();
		
		System.out.println(count+" Record Added");
		
		ResultSet rs = st.executeQuery("select * from employee   ");
                         // select query == executeQuery
		
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
		
		
		

	}
}
