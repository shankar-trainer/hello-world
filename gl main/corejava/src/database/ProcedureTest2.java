package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import database.util.DatabaseUtil;

public class ProcedureTest2 {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseUtil.retrieveConnection();
		System.out.println("Enter id to search employee");
		int id = new Scanner(System.in).nextInt();

		CallableStatement callableStatement = connection.prepareCall("{call emp_search(?,?,?)}");
		callableStatement.setInt(1, id);

		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.registerOutParameter(3, java.sql.Types.FLOAT);

		callableStatement.execute();
		ResultSet rs = callableStatement.getResultSet();
		//if (rs.next())
		{
			System.out.println(id + " is found ");
			System.out.println("name is " + rs.getString(2));
			System.out.println("Salary is " + rs.getFloat(3));
		} //else
			//System.out.println("Record not found");
	}
}
