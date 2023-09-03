package com.coforge;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.coforge.util.ConnectionUtil;

public class EmpData {

	public static void main(String[] args) {
		// 1.Load driver

		try {
			// 1st way to load Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2nd Way to load Driver
			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			// url , user, password
//			Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/db1", "root", "root");
			Connection connection =ConnectionUtil.userConnection();
			
			if (connection == null)
				System.out.println("some problem");
			else
				System.out.println("connection successful");

			Statement st = connection.createStatement();
			
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Enter id name and salary");
			int id=scanner.nextInt();
			scanner.nextLine();
			String name=scanner.nextLine();
			float salary=scanner.nextFloat();
			
			            //executeUpdate insert, update, delete
			
			int x = st.executeUpdate("insert into employee values("+id+",'"+name+"',"+salary+")");
			System.out.println(x+" Record added");
			
			                 //executeQuery -- select 
			ResultSet rs = st.executeQuery("select * from employee");

			while(rs.next())
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) +"\t"+ rs.getFloat(3));

			//rs.next();
			//System.out.println(rs.getInt("id") + "\t" + rs.getString("name") + rs.getFloat(3));

		} catch (SQLException e) {
			System.err.println(e.getMessage()+"  sql state "+e.getSQLState());
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
