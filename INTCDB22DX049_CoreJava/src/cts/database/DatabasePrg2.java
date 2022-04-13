package cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabasePrg2 {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db2", "root", "mysql");

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

			PreparedStatement pst = connection.prepareStatement("insert into  employee values(?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, salary);
			int res = pst.executeUpdate();
			System.out.println(res + "Record added");

		} catch (SQLException e) {
			System.err.println(e);
		}
	}
}
