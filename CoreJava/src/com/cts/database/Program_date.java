package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.sql.Date;
import java.util.Scanner;

public class Program_date {
	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
       //create table department (dept_id int primary key , name varchar(20), empid varchar(20), dob date);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id ");
		int id = sc.nextInt();

		System.out.println("Enter name ");
		sc.nextLine();
		String name = sc.nextLine();

		System.out.println("Enter employee id  ");
		String empid = sc.next();

		System.out.println("Enter date in dd-mm-yyyy format ");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		String s = sc.next();
		Date date=null;
		try {
			date = dateFormat.parse(s);
			java.sql.Date date2 = new java.sql.Date(date.getTime());

			PreparedStatement pst = connection.prepareStatement("insert into department values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, empid);
			pst.setDate(4, date2);

			pst.executeUpdate();
			System.out.println("record added");
		} catch (ParseException e) {
		 System.err.println("date not in format dd-mm-yyyy");
		}
	}

}
