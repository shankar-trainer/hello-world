package org.cognizant.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

import org.cognizant.database.util.DatabaseUtil;

public class StudentCallable {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseUtil.myConnection();
		CallableStatement cs = connection.prepareCall("call searchStudent(?,?,?,?,?)");

		cs.setInt(1, 1002);
		cs.registerOutParameter(2, java.sql.Types.VARCHAR);
		cs.registerOutParameter(3, java.sql.Types.VARCHAR);
		cs.registerOutParameter(4, java.sql.Types.FLOAT);
		cs.registerOutParameter(5, java.sql.Types.DATE);

		if (!cs.execute())
			System.out.println(cs.getString(2) + "  " + cs.getString(3) + "  " + cs.getFloat(4) + "  " + cs.getDate(5));
		else
			System.out.println("Record not found");
	}
}
