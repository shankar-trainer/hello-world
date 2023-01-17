package com.abc.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.abc.database.util.DatabaseUtil;

public class RecordInReverseDirection {

	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.myDatabaseConnection();
		
		//Statement st=connection.createStatement();
//		Statement st=connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);// default value
		Statement st=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);// default value
		
		ResultSet rs = st.executeQuery("select * from employee");
		
		System.out.println("all records ");
		rs.afterLast();
		
		while(rs.previous())
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
	}
}


/*  

 createStatement(1st arg,2nd arg)
 1st argument 
  resultSetType a result set type; 
    
	one of ResultSet.TYPE_FORWARD_ONLY, -- default  
	ResultSet.TYPE_SCROLL_INSENSITIVE,  
	or ResultSet.TYPE_SCROLL_SENSITIVE
 
 
 2nd argument
 
   resultSetConcurrency a concurrency type; 
      one of ResultSet.CONCUR_READ_ONLY 
	  or ResultSet.CONCUR_UPDATABLE
 
 
 
  
  
  
 * */
