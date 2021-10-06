package database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import database.util.DatabaseUtil;

public class ProcedureTest1 {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseUtil.retrieveConnection();

		Statement st = connection.createStatement();

		CallableStatement callableStatement = connection.prepareCall("{call emp_update_salary()}");
		callableStatement.execute();

		ResultSet rs = st.executeQuery("select * from employee");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));

	}
}
