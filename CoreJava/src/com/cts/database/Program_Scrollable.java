package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program_Scrollable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		// default value 1st arg Resultset Type,2nd arg Result set concurrency
		// Statement st =
		// connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);

		/*
		 * 1st arg -- scroll behaviour ResultSet.TYPE_FORWARD_ONLY -- default
		 * ResultSet.TYPE_SCROLL_INSENSITIVE ResultSet.TYPE_SCROLL_SENSITIVE 2nd arg
		 * ResultSet concurrency ResultSet.CONCUR_READ_ONLY-- default
		 * ResultSet.CONCUR_UPDATABLE
		 */

		Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("select * from employees");

		ResultSetMetaData metaData = rs.getMetaData();

		int colcount = metaData.getColumnCount();
		for (int i = 1; i <= colcount; i++) {
			System.out.print(metaData.getColumnName(i) + "     ");
		}
		System.out.println("\n");

		rs.afterLast();// cursor at afterLast position
		// while (rs.next())
		while (rs.previous())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));

	}
}
