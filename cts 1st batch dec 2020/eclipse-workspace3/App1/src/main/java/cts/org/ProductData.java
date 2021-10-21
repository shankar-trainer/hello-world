package cts.org;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import cts.org.util.DatabaseUtil;

public class ProductData {

	Statement st;
	Connection con;
	ResultSet rs;

	public ProductData() throws SQLException {
		con = DatabaseUtil.myConnection();
	}

	void showAllData() throws SQLException {
		st = con.createStatement();
		rs = st.executeQuery("select * from product");
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getFloat(3));
		}
	}

	public static void main(String[] args) {

		try {
			new ProductData().showAllData();
		} catch (SQLException e) {
			System.err.println(e);
		}
	}

}
