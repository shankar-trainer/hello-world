package cts.com.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import cts.com.database.util.DatabaseUtil;

public class CallableDemo {

	CallableStatement callableStatement;
	ResultSet rs;
	Connection connection;

	public CallableDemo() throws SQLException {
		connection = DatabaseUtil.myConnection();
	}

	float getAvgCost() throws SQLException {
		callableStatement = connection.prepareCall("{ call avgCost()}");
		rs = callableStatement.executeQuery();
		rs.next();
		return rs.getFloat(1);
	}

	
	void findProduct() throws SQLException {
		callableStatement = connection.prepareCall("{ call searchProduct(?,?,?)}");
		callableStatement.setInt(1, 6762);
		
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.registerOutParameter(3, java.sql.Types.FLOAT);
		callableStatement.execute();
		
		System.out.println(callableStatement.getString(2)+"\t"+callableStatement.getFloat(3));
	}
	
	public static void main(String[] args) {
		
		try {
			System.out.println(	new CallableDemo().getAvgCost());
			
			System.out.println("find product using in out parameter ");
			new CallableDemo().findProduct();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
