package cts.com.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import cts.com.database.util.DatabaseUtil;

public class Question1 {

	Statement st;
	ResultSet rs;

	Connection connection;
	Scanner scanner;

	public Question1() throws SQLException {
		connection = DatabaseUtil.myConnection();
		scanner = new Scanner(System.in);
	}

	ResultSetMetaData resultSetMetaData;

	ResultSet rs1;

	void showAllRecord() throws SQLException {
		st = connection.createStatement();

		rs1 = st.executeQuery("select count(*) from product");
		rs1.next();
		
		int rowcount = rs1.getInt(1);

		if (rowcount == 0)
			System.out.println("No Record present ");
		else {
			rs = st.executeQuery("select * from product");
			resultSetMetaData = rs.getMetaData();

			int colCount = resultSetMetaData.getColumnCount();

			for (int i = 1; i <= colCount; i++) {
				System.out.print(resultSetMetaData.getColumnName(i) + "\t");
			}
			System.out.println();

			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
			}
		}
	}

	void findProductId() throws SQLException {
		int id = scanner.nextInt();
		st = connection.createStatement();
		rs = st.executeQuery("select * from product where prd_id=" + id);
		if (rs.next()) {
			System.out.println("Record found ");
			System.out.println("prdId\tprdName\tprdCost");
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getFloat(3));
		} else
			System.out.println("Record not found");
	}

	PreparedStatement pst;

	void deleteProductId() throws SQLException {
		int id = scanner.nextInt();
		st = connection.createStatement();
		rs = st.executeQuery("select * from product where prd_id=" + id);
		if (rs.next()) {
			pst = connection.prepareStatement("delete from product where prd_id=?");
			pst.setInt(1, id);
			int x = pst.executeUpdate();
			if (x == 1)
				System.out.println("Record deleted");
		} else
			System.out.println("Record not found");
	}

	public static void main(String[] args) {

		String choice = "y";
		try {
			Question1 question1 = new Question1();

			while (choice.equalsIgnoreCase("y")) {
				System.out.println("1.Find By Id");
				System.out.println("2.Delete By Id");
				System.out.println("3.Show All Record");

				int op = question1.scanner.nextInt();

				switch (op) {
				case 1:
					question1.findProductId();
					break;
				case 2:
					question1.deleteProductId();
					break;
				case 3:
					question1.showAllRecord();
					break;

				default:
					System.out.println("wrong choice");
					break;
				}
				System.out.println("continue y\\n");
				choice = question1.scanner.next();
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
