package com.capgemini.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.capgemini.database.util.DatabaseUtil;

public class ProcedureCall {

	public static void main(String[] args) throws SQLException {

		Connection con = DatabaseUtil.myConnection();
		CallableStatement cst = con.prepareCall("call helloworld()");
		cst.execute();
		System.out.println("procedure excuted");

		CallableStatement cst1 = con.prepareCall("call triple(?)");
		cst1.setInt(1, 5);
		cst1.registerOutParameter(1, java.sql.Types.INTEGER);
		cst1.execute();

		int res = cst1.getInt(1);
		System.out.println("result is " + res);
		
		/*
		  not working
		CallableStatement cst2 = con.prepareCall("call sum2(?,?,?)");
		cst2.setInt(1, 5);
		cst2.setInt(2, 25);
		cst2.registerOutParameter(3, java.sql.Types.INTEGER);
		cst2.execute();

		 res = cst2.getInt(1);
		System.out.println("sum2 result is " + res);
*/		

		

	}
}
