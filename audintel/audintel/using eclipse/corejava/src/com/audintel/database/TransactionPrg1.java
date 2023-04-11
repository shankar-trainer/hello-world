package com.audintel.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.audintel.database.util.DatabaseUtil;

public class TransactionPrg1 {
	public static void getAllProduct(Connection con, Statement st) throws SQLException {
		ResultSet rs = st.executeQuery("select * from student");

		while (rs.next())
			System.out
					.println(rs.getLong(1) + "  " + rs.getString(2) + "   " + rs.getString(3) + "  " + rs.getFloat(4));
	}

	public static void main(String[] args) {

		try {
			Connection connection = DatabaseUtil.retrieveConnection();
			connection.setAutoCommit(false);

			Statement st = connection.createStatement();
			getAllProduct(connection, st);

			System.out.println("Enter student roll to be deleted ");

			PreparedStatement pst = connection.prepareStatement("delete from student  where roll=? ");
			pst.setInt(1, new Scanner(System.in).nextInt());

			if (pst.executeUpdate() == 1) {
				System.out.println("you want to delete the record y\\n");
				if (new Scanner(System.in).next().equals("y")) {
					connection.commit();

					System.out.println("Record deleted ");
				} else {
					connection.rollback();
					System.out.println("Record not deleted ");
				}
			} else
				System.out.println("Record not present  ");

			System.out.println("After record is deleted  All Students are  \n");
			getAllProduct(connection, st);

		} catch (SQLException e) {
			System.err.println(e.getMessage());
		}

	}

}
