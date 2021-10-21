package cts.com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabasePrg2 {

	public static void main(String[] args) {
		try {
			// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "mysql");

			Statement st = connection.createStatement();

			Scanner scanner = new Scanner(System.in);
			int prdId;
			String prdname;
			float prdCost;

			System.out.println("Enter product Id");
			prdId = scanner.nextInt();

			System.out.println("Enter product Name");
			scanner.nextLine();
			prdname = scanner.nextLine();

			System.out.println("Enter product cost");
			prdCost = scanner.nextFloat();

//			int x = st.executeUpdate("insert into product values(6765,'cycle ',10000.5)");
			int x = st.executeUpdate("insert into product values(" + prdId + ",'" + prdname + "'," + prdCost + ")");
			if (x == 1)
				System.err.println("Record added");

			ResultSet result = st.executeQuery("select * from product");

			while (result.next())
				System.out.println(result.getInt(1) + "   " + result.getString(2) + "  " + result.getFloat(3));
			scanner.close();

		} catch (SQLException | ClassNotFoundException e) {

			System.err.println(e.getMessage());

		}
	}

}
