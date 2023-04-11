package com.audintel.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

import com.audintel.database.util.DatabaseUtil;

public class Test1 {

	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.retrieveConnection();
		
		Statement st=connection.createStatement();
		LocalDate date=LocalDate.now();
		
		int x=st.executeUpdate("insert into test1 values('"+date+"')");
		System.out.println(x+" record added");
		
		
		PreparedStatement pst=connection.prepareStatement("insert into test1 values(?)");
		
		//pst.setDate(1, date);
		
	}
}
