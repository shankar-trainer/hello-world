package com.cts.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cts.jdbc.util.DatabaseUtil;

public class Example1 {

	public static void main(String[] args) {
		
		try {
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/db2 ","root","mysql");
			Connection connection=DatabaseUtil.myConnection();
			
			if(connection!=null)
			System.out.println("connection successful");
		else
			System.out.println("some problem in connection");
		
		Statement st=connection.createStatement();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id=sc.nextInt();
		
		System.out.println("Enter Name");
		sc.nextLine();
		
		String nm=sc.nextLine();
		
		System.out.println("Enter salary");
		float salary=sc.nextFloat();
         //executeUpadte() -- insert , update and delete 		
		int n=st.executeUpdate("insert into employee values("+id+",'"+nm+"',"+salary+")");
		if(n==1)
			System.out.println(n+" Record Added");
		// executeQuery -- select 
		ResultSet rs = st.executeQuery("select * from employee");
		
		while(rs.next())
		System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		
		} catch (SQLException e) {
			System.err.println(e);
		}
		
		
	}
}
