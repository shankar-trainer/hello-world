package com.capg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMain3 {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			// load the driver
			DriverManager.registerDriver(new org.postgresql.Driver());
			// get connection

			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db4", "postgres",
					"postgres");
			Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			sc = new Scanner(System.in);
			System.out.println("Enter Roll");
			int roll=sc.nextInt();

			ResultSet rs = st.executeQuery("select * from student where roll ="+roll);
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			}

		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			sc.close();
		}
	}
}
