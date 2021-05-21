package com.cts.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class DbConnectionManager {

	private DbConnectionManager() {
	};

	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	static Connection connection;


	public static Connection myConnection() throws SQLException {
		String driver=null, url=null, uname=null, pass=null;
	     FileInputStream fis = null;
	        try {
	            fis = new FileInputStream("src/database.properties");
	            Properties p = new Properties();
	            p.load(fis);
	            driver = p.getProperty("drivername");
	            url = p.getProperty("url");
	            uname = p.getProperty("username");
	            pass = p.getProperty("password");

	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                fis.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }

		if (connection == null) {
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbaj06", "root", "mysql");
			connection = DriverManager.getConnection(url,uname,pass);
		}
		return connection;
	}
}
