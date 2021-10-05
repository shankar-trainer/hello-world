package com.capgemini.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection
				("jdbc:postgresql://localhost/db1?user=postgres&password=postgres&ssl=false");
		Statement st = connection.createStatement();

		int id;
		String name;
		String location;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id ");
		id=scanner.nextInt();
		
		System.out.println("Enter Name ");
		scanner.nextLine();
		name=scanner.nextLine();
		
		System.out.println("Enter Location ");
		location=scanner.next();
  		
		//int n=st.executeUpdate("insert into customer(id,name,location) values(8772,'ram kumar','patna')");
		int n=st.executeUpdate("insert into customer(id,name,location) values("+id+",'"+name+"','"+location+"')");
		System.out.println(n+" Record added ");
		
		
		ResultSet rs = st.executeQuery("select * from customer");
		
		while(rs.next())
		System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " \t" + rs.getString(3));

	}
}





