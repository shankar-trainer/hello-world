package org.cognizant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import org.cognizant.database.util.DatabaseUtil;

public class DatabasePrg2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	//	Class.forName("com.mysql.cj.jdbc.Driver");

		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db1", "root", "mysql");
		Connection con=DatabaseUtil.myConnection();
		
		Statement st = con.createStatement();
		PreparedStatement pst;

		int id;
		String name;
		float cost;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		id = sc.nextInt();

		System.out.println("Enter Book Name ");
		sc.nextLine();
		name = sc.nextLine();

		System.out.println("Enter cost   ");
		cost = sc.nextFloat();
		pst = con.prepareStatement("insert into book  (isbn,bname,cost) values(?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, cost);

		int p = pst.executeUpdate();
		System.out.println(p + " Record Inserted");

		ResultSet rs = st.executeQuery("select * from book");
		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + " " + rs.getFloat(3));

	}
}
