package com.nec.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {

		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());// load the driver
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/nec", "root", "");
			Statement statement = connection.createStatement();

			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter id ");
			int id = scanner.nextInt();

			System.out.println("Enter name ");
			scanner.nextLine();
			String name = scanner.nextLine();

			System.out.println("Enter Salary ");
			float salary = scanner.nextFloat();
			// connection.prepareStatement("insert into employee values(" + id + ",'" + name
			// + "'," + salary + ")");

			try {
				PreparedStatement pst = connection.prepareStatement("insert into employee values(?,?,?)");

				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setFloat(3, salary);
				int x = pst.executeUpdate();
				if (x == 1)
					System.out.println("Record added ");
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
