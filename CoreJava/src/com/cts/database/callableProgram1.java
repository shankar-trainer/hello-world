package com.cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class callableProgram1 {

	 Statement st;
	 PreparedStatement pst;
	 
	 CallableStatement cst;
	 Connection connection;
	 
	 public callableProgram1() throws SQLException {
	    connection=DatabaseUtil.getMyConnection();
	 }
	 
	 public void StudentSearch(int roll) throws SQLException {
		 cst=connection.prepareCall("{call searchStudent(?,?,?,?)}");
		 cst.setInt(1, roll);
		 cst.registerOutParameter(2, java.sql.Types.VARCHAR);
		 cst.registerOutParameter(3, java.sql.Types.VARCHAR);
		 cst.registerOutParameter(4, java.sql.Types.FLOAT);
		 
		 cst.execute();
		 
		String nm= cst.getString(2);
		String sb= cst.getString(3);
		float marks= cst.getFloat(4);
		 System.out.println("name is "+nm);
		 System.out.println("subject is "+sb);
		 System.out.println("salary  is "+marks);
	 }
	 
	 
	
	public static void main(String[] args) throws SQLException {
		callableProgram1 program1=new callableProgram1();
		program1.StudentSearch(1001);
		
	}
}
