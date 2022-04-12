package com.cts.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cts.jdbc.util.DatabaseUtil;

public class ProcedurePrg1 {

	
	public static void main(String[] args) throws SQLException {
		Connection connection=DatabaseUtil.myConnection();
		
		CallableStatement cst=connection.prepareCall("{call allemployee()}");
		ResultSet rs = cst.executeQuery();
		
		while(rs.next())
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getFloat(3));
		
		
	}
}
