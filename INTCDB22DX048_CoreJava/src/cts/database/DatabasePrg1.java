package cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import cts.database.util.DataBaseUtil;

public class DatabasePrg1 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "mysql");
			Connection connection=DataBaseUtil.myConnection();
			
			if (connection != null)
				System.out.println("connection successful");
			else
				System.out.println("connection problem");
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter id ");
			int id = sc.nextInt();

			System.out.println("Enter Name ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Enter Salary ");
			float salary = sc.nextFloat();

			int res = st.executeUpdate("insert into  employee values(" + id + ",'" + name + "'," + salary + ")");
			System.out.println(res + "Record added");
			

		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
