package com.cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.cts.database.util.DatabaseIUtil;
import com.mysql.cj.protocol.Resultset;

public class DatabasePrg3 {

	public static void main(String[] args) {

		try {
			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			// Connection connection =
			// DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db3", "root",
			// "mysql");

			Connection connection = DatabaseIUtil.getMyConnection();

			CallableStatement cst = connection.prepareCall("{call searchBook(?,?,?,?)}");
			cst.setInt(1, 7676);
			cst.registerOutParameter(2, java.sql.Types.VARCHAR);
			cst.registerOutParameter(3, java.sql.Types.VARCHAR);
			cst.registerOutParameter(4, java.sql.Types.FLOAT);

			if (!cst.execute()) {

				System.out.println(cst.getString(2));
				System.out.println(cst.getString(3));
				System.out.println(cst.getFloat(4));
			} else
				System.out.println("not found");

		} catch (SQLException e) {
			System.err.println(e);
		}

	}// cts_db3
}
