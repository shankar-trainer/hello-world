package edu.abc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeApp1 {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection connection = DriverManager.getConnection
		 ("jdbc:mysql://localhost:3306/montran", "root","mysql");
	
		Statement st=connection.createStatement();
		ResultSet rs=st.executeQuery("select * from employee");
		
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3));
		}
		
	}
	
}
