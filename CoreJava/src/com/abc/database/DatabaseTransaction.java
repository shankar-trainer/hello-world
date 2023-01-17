package com.abc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.abc.database.util.DatabaseUtil;

public class DatabaseTransaction {
	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.myDatabaseConnection();
		Scanner sc=new Scanner(System.in);
		
//		connection.setAutoCommit(true);//default
		connection.setAutoCommit(false);//changed default
		
		Statement st=connection.createStatement();
		
		ResultSet rs = st.executeQuery("select * from employee");
		
		System.out.println("all records ");
		while(rs.next())
			System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		
		System.out.println("Enter id name and salary ");
		PreparedStatement pst=connection.prepareStatement("insert into employee values(?,?,?)");
	      pst.setInt(1, sc.nextInt());
	      sc.nextLine();
	      pst.setString(2, sc.nextLine());
	      pst.setFloat(3, sc.nextFloat());
	      
	      if(pst.executeUpdate()==1) {
	    	   System.out.println("do you want to save record in database");
	    	   if(sc.next().equalsIgnoreCase("y")) {
	    		   connection.commit();
	    	  System.out.println("Record added");
	    	   }
	    	   else {
	    		   connection.rollback();
	    		   System.out.println("Record not added");
	    	   } 
	      }
	      else 
	    	  System.out.println("some problem ");
	
	      System.out.println("all records ");
	      rs = st.executeQuery("select * from employee");
			while(rs.next())
				System.out.println("\t"+rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		
	}
	
	
	
	
}
