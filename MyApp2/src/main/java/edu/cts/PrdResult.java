package edu.cts;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cts.org.util.DatabaseUtil;

public class PrdResult {

	public static void main(String[] args) throws SQLException {
		Connection con = DatabaseUtil.myConnection();
		Statement statement = con.createStatement();

		ResultSet rs = statement.executeQuery("select * from product");

		while (rs.next())
			System.out.println(rs.getInt(1) + " " + rs.getString(2));

	}
}
