package com.abc.database;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import com.abc.database.util.DatabaseUtil;

public class Program2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Properties properties = new Properties();
		String driver, url, uname, pass;
		try {
		/*	properties.load(new FileInputStream("database.properties"));
			driver = properties.get("driver").toString();
			uname = properties.get("user").toString();
			url = properties.get("url").toString();
			pass = properties.get("password").toString();

			Class.forName(driver);
			*/
			
//			Connection connnection = DriverManager.getConnection(url, uname, pass);
			Connection connnection = DatabaseUtil.myDatabaseConnection();
			Statement createStatement = connnection.createStatement();
			ResultSet rs = createStatement.executeQuery("select * from  book");

			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t");

		} catch (SQLException e) {
			System.err.println(e);
			e.printStackTrace();
		} 

	}
}
