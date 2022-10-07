package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class JdbcPrg4 {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	ResultSetMetaData metaData;
	
	Scanner scanner;
	PreparedStatement pst;

	public JdbcPrg4() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/montran", "root", "mysql");
		
		//statement = connection.createStatement(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_READ_ONLY);
		statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		scanner = new Scanner(System.in);
	}

	public void showAllResult() throws SQLException {
		
		resultSet = statement.executeQuery("select * from employee");
		metaData=resultSet.getMetaData();
		
		for (int i = 1; i <=metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i)+"  ");
		}
		
		System.out.println("\n");
		
		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + " " + resultSet.getFloat(3) + "  "
					+ resultSet.getDate(4));
	}

	public void showAllResult1() throws SQLException {
		
		resultSet = statement.executeQuery("select * from employee");
		metaData=resultSet.getMetaData();
		
		for (int i = 1; i <=metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i)+"  ");
		}
		
		System.out.println("\n");
		
		resultSet.afterLast();
		
		while (resultSet.previous())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + " " + resultSet.getFloat(3) + "  "
					+ resultSet.getDate(4));
	}

	
	void closeResources() throws SQLException {
		connection.close();
		statement.close();
		resultSet.close();
	}
	
	public static void main(String[] args) {
		
		JdbcPrg4 jdbcPrg4;
		try {
			jdbcPrg4 = new JdbcPrg4();
			jdbcPrg4.showAllResult();
			
			System.out.println("\n");
			jdbcPrg4.showAllResult1();
			
			
		} catch (ClassNotFoundException | SQLException e) {
			//e.printStackTrace();
			System.err.println(e);
		}
	}

}
