package com.audintel.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Date;

import com.audintel.database.util.DatabaseUtil;

public class StudentDatbasePrg2 {

	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.retrieveConnection();
		Statement st=connection.createStatement();
		
		LocalDate date2=LocalDate.of(2000, 12, 30);
		
		//st.executeUpdate("insert into student1 values(212121,'ram kumar','2000-10-22')");
		String name="mohan kumar";
		int roll=10002;
		
		st.executeUpdate("insert into student1 values("+roll+",'"+name+"','"+date2+"')");
		
		System.out.println("Record added ");
	    
		
		java.sql.Date date=java.sql.Date.valueOf(date2);
		
		
		PreparedStatement preparedStatement=connection.prepareStatement("insert into student1 values(?,?,?)");
     preparedStatement.setInt(1, roll);		
     preparedStatement.setString(2, name);		
//     preparedStatement.setDate(3, date);		
     preparedStatement.setDate(3, java.sql.Date.valueOf(date2));
     preparedStatement.executeUpdate();
     
		
	}
}
