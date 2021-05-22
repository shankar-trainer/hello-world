package cts.com.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cts.com.database.util.DatabaseUtil;

public class Test2 {

	public static void main(String[] args) throws SQLException {

		Connection connection = DatabaseUtil.myConnection();
		Statement statement = connection.createStatement();

		ResultSet rs = statement.executeQuery("select id from product where id=6669");

		while (rs.next())
			System.out.println(rs.getInt(1));
	}
}
