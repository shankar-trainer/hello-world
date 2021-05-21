package com.cts.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TransactionProgram {
	Statement st;
	PreparedStatement pst;

	Connection connection;
	Scanner scanner;
	int roll;
	String name, subject;
	float marks;
	String ch;

	public TransactionProgram() throws SQLException {
		scanner = new Scanner(System.in);
		connection = DatabaseUtil.getMyConnection();
		connection.setAutoCommit(false);
	}

	public void addRecord() throws SQLException {
		System.out.println("Enter roll name subject and marks ");
		roll = scanner.nextInt();
		scanner.nextLine();
		name = scanner.nextLine();
		subject = scanner.nextLine();
		marks = scanner.nextFloat();

		pst = connection.prepareStatement("insert into student values(?,?,?,?)");
		pst.setInt(1, roll);
		pst.setString(2, name);
		pst.setString(3, subject);
		pst.setFloat(4, marks);
		
		pst.executeUpdate();

		System.out.println("save it in database y\\n");
		ch = scanner.next();
		if (ch.contentEquals("y"))
			connection.commit();
		else
			connection.rollback();
	}

	public void deleteRecord() throws SQLException {
		System.out.println("Enter roll  ");
		roll = scanner.nextInt();

		pst = connection.prepareStatement("delete from  student  where  roll=?");
		pst.setInt(1, roll);
		pst.executeUpdate();

		System.out.println("delete from  database y\\n");
		ch = scanner.next();
		if (ch.contentEquals("y"))
			connection.commit();
		else
			connection.rollback();

	}

	public static void main(String[] args) throws SQLException {
      TransactionProgram program=new TransactionProgram();
      program.addRecord();
      program.deleteRecord();
      
	}
}
