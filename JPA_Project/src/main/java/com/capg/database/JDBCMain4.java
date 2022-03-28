package com.capg.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCMain4 {

	public static void main(String[] args) {
		Scanner sc = null;

		try {
			// load the driver
			DriverManager.registerDriver(new org.postgresql.Driver());
			// get connection

			Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost/db4", "postgres",
					"postgres");
			Statement st = connection.createStatement();
			sc = new Scanner(System.in);
			System.out.println("Enter Roll");
			int roll = sc.nextInt();
			PreparedStatement pst = connection.prepareStatement("select * from student where roll=?");
			pst.setInt(1, roll);

			ResultSet rs = pst.executeQuery();

			if (rs.next()) {
				System.out.println("Record found with roll " + roll);
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3));
			} else
				System.out.println("Record not found with roll " + roll);

		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			sc.close();
		}
	}
}
