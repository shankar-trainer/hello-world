package com.audintel.database;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.audintel.database.util.DatabaseUtil;

public class StudentDatbasePrg1 {

	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.retrieveConnection();
		Statement st=connection.createStatement();
		
		Date date=new Date();
		
		java.sql.Date date2=new java.sql.Date(date.getDate());
		
		//st.executeUpdate("insert into student1 values(212121,'ram kumar','2000-10-22')");
		String name="mohan kumar";
		int roll=10001;
		
		st.executeUpdate("insert into student1 values("+roll+",'"+name+"','"+date2+"')");
		
		System.out.println("Record added ");
		
	}
}
