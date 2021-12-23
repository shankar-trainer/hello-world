package com.cognizant.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import com.cognizant.database.util.DataBaseUtil;

public class CallableProcedureProgram {

	CallableStatement cst;
	Connection con;
	Scanner sc;

	public CallableProcedureProgram() throws SQLException {
		con = DataBaseUtil.retrieveConnection();
		sc = new Scanner(System.in);
	}

	void searchEmployee() throws SQLException {
		cst = con.prepareCall("{call   searchEmp(?,?,?)}");
		System.out.println("Enter id to search ");
		cst.setInt(1, sc.nextInt());
		cst.registerOutParameter(2, java.sql.Types.VARCHAR);
		cst.registerOutParameter(3, java.sql.Types.FLOAT);
		try {
			cst.execute();

			System.out.println("name  is " + cst.getString(2));
			System.out.println("salary   is " + cst.getString(3));
		} catch (SQLException e) {
			System.err.println("no record present");
		}
	}

	public static void main(String[] args) {
		try {
			new CallableProcedureProgram().searchEmployee();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

/*
  create or replace procedure searchEmp(id1 int, name1 out varchar, salary1 out
  int ) 
  is 
  begin 
   select name,salary into name1,salary1 from employee where  id=id1; 
  
  end;
 
 */
