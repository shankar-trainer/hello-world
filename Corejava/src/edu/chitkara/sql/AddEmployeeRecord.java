package edu.chitkara.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddEmployeeRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chitkara", "root",	"mysql");
			
	Statement st = connection.createStatement();
int x = st.executeUpdate("insert into employee values(10004,'rahul ranjan',34000.0)");
		   if(x==1)
			   System.out.println(x+" Record added");
		   
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
