package com.audintel.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseProgram3 {

	public static void main(String[] args) {
		try {
			Class.forName("org.h2.Driver");// 2nd way to load driver
			Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
			System.out.println(connection);
			
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from BOOK");

			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}
}
