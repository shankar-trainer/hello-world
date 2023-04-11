package com.audintel.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.audintel.database.util.DatabaseUtil;

public class ProcedureCalling {

	public static void main(String[] args) {
		Connection connection;
		CallableStatement callableStatement;
		try {
			connection = DatabaseUtil.retrieveConnection();
			 callableStatement=connection.prepareCall("{call productAvgPrice}");
			ResultSet executeQuery = callableStatement.executeQuery();
			
			executeQuery.next();
			
			float avgCost=executeQuery.getFloat(1);
			
			System.out.println("average cost is "+avgCost);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
