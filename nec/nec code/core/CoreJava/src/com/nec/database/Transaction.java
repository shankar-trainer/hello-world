package com.nec.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class Transaction {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());// load the driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nec", "root", "");
			connection.setAutoCommit(false);
			Statement statement = connection.createStatement();

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id ");
			int id = scanner.nextInt();

			try {
				PreparedStatement pst = connection.prepareStatement("delete from  employee where eid=?");

				pst.setInt(1, id);
				
				int x = pst.executeUpdate();
				
				System.out.println("you want to delete or not ");
			 
				if(scanner.next().equals("y")) {
				  connection.commit();	
				  if (x == 1)
						System.out.println("Record deleted");
				  else
						System.out.println("Record not found with employee id "+id);
	
				}
				else
					connection.rollback();
				
							} catch (SQLIntegrityConstraintViolationException e) {
				System.err.println(e.getMessage());
			}
			ResultSet rs = statement.executeQuery("select * from employee");

			System.out.println("All Records ");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
