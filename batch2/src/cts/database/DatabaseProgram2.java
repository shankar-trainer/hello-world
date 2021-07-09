package cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import cts.database.util.DatabaseUtil;

public class DatabaseProgram2 {
//cts_db2

	public static void main(String[] args) {
		try {
			// Class.forName("com.mysql.cj.jdbc.Driver");
			//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cts_db2", "root", "mysql");
			
			Connection con=DatabaseUtil.MyConnection();
			
			Statement st = con.createStatement();
			Scanner scanner = new Scanner(System.in);
			int id;
			String name;
			float salary;
			Date dob;

			System.out.println("Enter Id");
			id = scanner.nextInt();

			System.out.println("Enter Name");
			scanner.nextLine();
			name = scanner.nextLine();

			System.out.println("Enter salary");
			salary = scanner.nextFloat();

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

			System.out.println("Enter Date in dd-MM-yyyy format");
			String s = scanner.next();
			java.sql.Date date1 = null;
			try {
				Date date = dateFormat.parse(s);
				date1 = new java.sql.Date(date.getTime());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			PreparedStatement pst=con.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setFloat(3, salary);
			pst.setDate(4, date1);
			
			int res = pst.executeUpdate();
			
			System.out.println(res + " Record added");

			ResultSet rs = st.executeQuery("select * from employee");

			ResultSetMetaData metaData = rs.getMetaData();
			int column_count = metaData.getColumnCount();
			for (int i = 1; i <= column_count; i++) {
				System.out.print(metaData.getColumnName(i) + "  ");
			}
			System.out.println();
			while (rs.next())
				System.out
						.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3) + "  " + rs.getDate(4));

			rs = st.executeQuery("select count(*) from employee");
			rs.next();

			System.out.println("total no of rows are " + rs.getInt(1));
			rs = st.executeQuery("select max(salary) from employee");
			rs.next();

			System.out.println("max  salary " + rs.getFloat(1));

			// rs.next();

			// System.out.println(rs.getInt("empid")+" "+rs.getString("name")+"
			// "+rs.getFloat(3)+" "+rs.getDate(4));
		} catch (
		// ClassNotFoundException |
		SQLException e) {
			System.err.println(e);
		}

	}
}
