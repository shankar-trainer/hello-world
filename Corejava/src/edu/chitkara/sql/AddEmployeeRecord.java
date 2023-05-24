package edu.chitkara.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class AddEmployeeRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/chitkara", "root",
					"mysql");
			Scanner scanner = new Scanner(System.in);
			int id;
			String name;
			double salary;
			System.out.println("Enter id name and salary ");
			id = scanner.nextInt();
			scanner.nextLine();
			name = scanner.nextLine();
			salary = scanner.nextDouble();

			Statement st = connection.createStatement();
//int x = st.executeUpdate("insert into employee values(10004,'rahul ranjan',34000.0)");
			int x = st.executeUpdate("insert into employee values(" + id + ",'" + name + "'," + salary + ")");
			if (x == 1)
				System.out.println(x + " Record added");

			ResultSet rs = st.executeQuery("select * from employee");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getDouble(3));

		} catch (ClassNotFoundException | SQLException e) {
			System.err.println(e.getMessage());
		}
	}
}
