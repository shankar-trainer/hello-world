package cts.com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import cts.com.database.util.DatabaseUtil;

public class TransactionDemo {
	ResultSet rs;
	Connection connection;
	PreparedStatement pst;
	Statement st;

	Scanner scanner;

	public TransactionDemo() throws SQLException {
		connection = DatabaseUtil.myConnection();
		connection.setAutoCommit(false);// ----- handle transaction
		scanner = new Scanner(System.in);
	}

	void addRecord() throws SQLException {
		System.out.println("Enter id and name");
		int id = scanner.nextInt();
		scanner.nextLine();
		String name = scanner.nextLine();

		pst = connection.prepareStatement("insert into person values(?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);

		int p = pst.executeUpdate();

		System.out.println("Save record");
		if (scanner.next().equalsIgnoreCase("y"))
			connection.commit();
		else
			connection.rollback();

		if (p == 1)
			System.out.println("Record added ");
	}

	void showAll() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from person");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2));
	}

	public static void main(String[] args) {

		try {
			TransactionDemo demo = new TransactionDemo();
			demo.addRecord();

			demo.showAll();

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}
}
