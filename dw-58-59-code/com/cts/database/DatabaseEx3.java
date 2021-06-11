package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseEx3 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {

		Class.forName("com.mysql.jdbc.Driver");

		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3", "root", "mysql");

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee   ");
                         // select query == executeQuery
		ResultSetMetaData metaData=rs.getMetaData();
		for (int i = 1; i <=metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i)+" ");
		}
				System.out.println();
		
		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
		
   System.out.println();
	rs=	st.executeQuery("select count(*) from employee");
	rs.next();
	System.out.println(rs.getInt(1)+" total no of record");

	rs=	st.executeQuery("select max(salary) from employee");
	rs.next();
	System.out.println(rs.getFloat(1)+" maximum salary");
	
	rs=	st.executeQuery("select min(salary) from employee");
	rs.next();
	System.out.println(rs.getFloat(1)+" minimum salary");
	
	rs=	st.executeQuery("select avg(salary) from employee");
	rs.next();
	System.out.println(rs.getFloat(1)+" average salary");
	
	rs=	st.executeQuery("select sum(salary) from employee");
	rs.next();
	System.out.println(rs.getFloat(1)+" total  salary");
	
	
	
		

	}
}
