package com.capgemini.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import com.capgemini.database.util.DatabaseUtil;

public class ProcedureCall1 {

	public static void main(String[] args) throws SQLException {
		Connection con = DatabaseUtil.myConnection();
		CallableStatement cst = con.prepareCall("call searchstudent1(?,?)");
		cst.setInt(1, 100);
		cst.registerOutParameter(1, java.sql.Types.INTEGER);
		
		cst.setString(2, null);
		cst.registerOutParameter(2, java.sql.Types.VARCHAR);
		

		cst.execute();
		String name = cst.getString(1);
		if (name != null)
			System.out.println("found name is " + name);
		else
			System.out.println("not found");

	}
}
