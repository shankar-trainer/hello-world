package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());

		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		int id = sc.nextInt();

		System.out.println("Enter name ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter salary ");
		float salary = sc.nextFloat();

		System.out.println("Enter Location ");
		String location = sc.next();

		Statement st = connection.createStatement();
		PreparedStatement pst=connection.prepareStatement("insert into employee values(?,?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, salary);
		pst.setString(4,location);
	   
		int no=pst.executeUpdate();
				System.out.println(no + " Record added");

		ResultSet rs = st.executeQuery("select * from employee");

		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getString(4));
        connection.close();
        sc.close();
        st.close();
        pst.close();
	}
}
