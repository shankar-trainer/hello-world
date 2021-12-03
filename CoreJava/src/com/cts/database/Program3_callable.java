package com.cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Program3_callable {

	public static void main(String[] args) {
		Scanner sc = null;
		Connection connection = null;
		try {
			sc = new Scanner(System.in);
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			System.out.println("Enter id ");
			int id = sc.nextInt();

			System.out.println("Enter name ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Enter salary ");
			float salary = sc.nextFloat();

			System.out.println("Enter Location ");
			String location = sc.next();

			CallableStatement cst = connection.prepareCall("call emp_insert(?,?,?,?)");
			cst.setInt(1, id);
			cst.setString(2, name);
			cst.setFloat(3, salary);
			cst.setString(4, location);

			boolean execute = cst.execute();
			System.out.println("record added ");

		}

		catch (SQLIntegrityConstraintViolationException e) {
			//System.out.println(e.getMessage());
			System.out.println("id already present");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			sc.close();
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}
}
