package org.cognizant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabasePrg1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con = DriverManager.getConnection
				("jdbc:mysql://localhost:3306/cts_db1", "root", "mysql");
		
		if (con != null)
			System.out.println("connection is successful ");
		else
			System.out.println("some problem");
		
		Statement st=con.createStatement();
		int id;
		String name;
		float salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id ");
		id=sc.nextInt();
		
		System.out.println("Enter Book Name ");
		 sc.nextLine();
		name=sc.nextLine();
		
		System.out.println("Enter cost   ");
		salary=sc.nextFloat();

		st.executeUpdate("insert into book  (isbn,bname,cost) values("+id+",'"+name+"',"+salary+")");
		
		ResultSet rs=  st.executeQuery("select * from book");
		while(rs.next())
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getFloat(3));
		
	}
}
