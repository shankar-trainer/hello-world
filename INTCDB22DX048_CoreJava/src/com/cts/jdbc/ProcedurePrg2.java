package com.cts.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.jdbc.util.DatabaseUtil;

public class ProcedurePrg2 {

	
	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.myConnection();
	//	int id=1001;
		int id=987001;
		
		CallableStatement cst=connection.prepareCall("{call searchemployee(?,?,?)}");
		cst.setInt(1, id);
		cst.registerOutParameter(2,java.sql.Types.VARCHAR );
		cst.registerOutParameter(3,java.sql.Types.FLOAT );
		
		cst.execute();
		
		String name=cst.getString(2);
		float salary=cst.getFloat(3);
		
		if(name!=null) {
			System.out.println("found values for id "+id);
			System.out.println("name is "+name);
			System.out.println("salary is "+salary);
		}
		else
			System.out.println("not found for id "+id);
		
	}
}
