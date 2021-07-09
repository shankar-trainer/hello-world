package cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import cts.database.util.DatabaseUtil;

public class CallablePrg1 {

	public static void main(String[] args) throws SQLException {
	  Connection connection=DatabaseUtil.MyConnection();
		
	  CallableStatement callableStatement=connection.prepareCall("{call searchemployee(?,?,?,?)}");
	  callableStatement.setInt(1, 8080);
	  callableStatement.registerOutParameter(2,java.sql.Types.VARCHAR);
	  callableStatement.registerOutParameter(3,java.sql.Types.FLOAT);
	  callableStatement.registerOutParameter(4,java.sql.Types.DATE);
	  
	  callableStatement.execute();
	  
	  System.out.println(callableStatement.getString(2));
	  System.out.println(callableStatement.getFloat(3));
	  System.out.println(callableStatement.getDate(4));
	  
		
	} 
	
}
