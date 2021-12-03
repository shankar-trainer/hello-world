package com.cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Scanner;

public class Program4_callable {

	public static void main(String[] args) {
		Scanner sc = null;
		Connection connection = null;
		try {
			sc = new Scanner(System.in);
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
			System.out.println("Enter id ");
			int id = sc.nextInt();

			CallableStatement cst = connection.prepareCall("call emp_query(?,?,?,?)");
			cst.setInt(1, id);
			cst.registerOutParameter(2, java.sql.Types.VARCHAR);
			cst.registerOutParameter(3, java.sql.Types.FLOAT);
			cst.registerOutParameter(4, java.sql.Types.VARCHAR);

			cst.execute();
			String name = cst.getString(2);
			float salary = cst.getFloat(3);
			String location = cst.getString(4);
			if (name == null && salary == 0 && location == null)
				System.out.println("record not found for id " + id);
			else {
				System.out.println("Record found  for id " + id);
				System.out.println("name " + name);
				System.out.println("salary " + salary);
				System.out.println("location " + location);
			}
		}

		catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("id already present");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
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
