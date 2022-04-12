package cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import cts.database.util.DatabaseUtil;

public class Example1 {
	public static void main(String[] args) throws SQLException {

		// DriverManager.registerDriver(new com.mysql.jdbc.Driver());
		// Connection connection =
		// DriverManager.getConnection("Jdbc:mysql://localhost:3306/db1","root","mysql");

		Connection connection = DatabaseUtil.myConnection();

		if (connection != null)
			System.out.println("connection successful");
		else
			System.out.println("connection problem");

		Statement st = connection.createStatement();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter id");
		int id = sc.nextInt();

		System.out.println("Enter name");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter salary");
		float salary = sc.nextFloat();

		int row = st.executeUpdate("insert into employee values(" + id + ",'" + name + "'," + salary + ")");

		System.out.println(row + " record inserted");

		ResultSet rs = st.executeQuery("select * from employee");

		while (rs.next())
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));

	}
}
