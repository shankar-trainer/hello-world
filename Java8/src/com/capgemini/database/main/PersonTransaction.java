package com.capgemini.database.main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.capgemini.database.model.Person;
import com.capgemini.database.util.DatabaseUtil;

public class PersonTransaction {

	public static void main(String[] args) throws SQLException {

		Connection connection;
		Statement st;
		PreparedStatement pst;

		ResultSet rs;

		connection = DatabaseUtil.myConnection();
		connection.setAutoCommit(false);

		st = connection.createStatement();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter id");
		int id = scanner.nextInt();

		System.out.println("Enter Name");
		scanner.nextLine();
		String name = scanner.nextLine();

		System.out.println("Enter Salary");
		float sal = scanner.nextFloat();

		System.out.println("Enter DOB in dd\\MM\\yyyy format ");
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd\\MM\\yyyy");

		String s1 = scanner.next();

		Date parse = null;
		try {
			parse = dateFormat.parse(s1);
		} catch (ParseException e) {
			System.out.println("dob not in format of dd\\MM\\yyyy");
		}
		pst = connection.prepareStatement("insert into person(id,name,salary,dob) values(?,?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, sal);
		pst.setDate(4, new java.sql.Date(parse.getTime()));

		pst.executeUpdate();

		System.out.println("save record y\\n");
		String s2 = scanner.next();
		if (s2.equalsIgnoreCase("y")) {
			connection.commit();
			System.out.println("Record added ");
		} else
			connection.rollback();
		System.out.println("Record not  added ");
	}
}
