package com.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.Scanner;

public class JdbcPrg3 {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	ResultSetMetaData metaData;
	
	Scanner scanner;
	PreparedStatement pst;

	public JdbcPrg3() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/montran", "root", "mysql");
		statement = connection.createStatement();
		scanner = new Scanner(System.in);
	}

	public void showAllResult() throws SQLException {
		
		resultSet = statement.executeQuery("select * from employee");
		metaData=resultSet.getMetaData();
		
		for (int i = 1; i <=metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i)+"  ");
		}
		
		System.out.println("\n");
		
		while (resultSet.next())
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + " " + resultSet.getFloat(3) + "  "
					+ resultSet.getDate(4));
	}
	
	void addRecord() throws SQLException {
		int id;
		String name;
		String dob;
		float salary;
		// Date date;

		System.out.println("Enter id name salary date in  yyyy-MM-dd formate ");
		id = scanner.nextInt();
		scanner.nextLine();
		name = scanner.nextLine();
		salary = scanner.nextFloat();
		dob = scanner.next();

//	  int res=statement.executeUpdate("insert into  employee (emp_id,name,salary)  values("+roll+",'"+name+"',"+salary+")");
		// int res=statement.executeUpdate("insert into employee
		// values("+roll+",'"+name+"',"+salary+",'2000-10-10')");
		int res = statement.executeUpdate(
				"insert into  employee   values(" + id + ",'" + name + "'," + salary + ",'" + dob + "')");
		if (res == 1)
			System.out.println("Record added");

	}

	void removeRecord() throws SQLException {
		int id;
		System.out.println("Enter id to remove record ");
		id = scanner.nextInt();

		pst = connection.prepareStatement("select *  from employee where emp_id=? ");
		resultSet = null;
		pst.setInt(1, id);
		resultSet = pst.executeQuery();

		if (resultSet.next()) {
			pst = null;
			pst = connection.prepareStatement("delete from employee where emp_id=? ");
			pst.setInt(1, id);

			int x = pst.executeUpdate();
			if (x == 1)
				System.out.println("Record deleted");
		} else
			System.out.println("Record not present with given id " + id);

	}

	void searchRecord() throws SQLException {
		int id;
		System.out.println("Enter id to search  record ");
		id = scanner.nextInt();

		pst = connection.prepareStatement("select *  from employee where emp_id=? ");
		resultSet = null;
		pst.setInt(1, id);
		resultSet = pst.executeQuery();

		if (resultSet.next()) {
			System.out.println("Record found ");
			System.out.println(resultSet.getInt(1) + "  " + resultSet.getString(2) + "  " + resultSet.getFloat(3) + "  "
					+ resultSet.getDate(4));

		} else
			System.out.println("Record not found with id  " + id);
	}
	

	void updateRecord() throws SQLException {
		int id;
		System.out.println("Enter id to update  record ");
		id = scanner.nextInt();

		pst = connection.prepareStatement("select *  from employee where emp_id=? ");
		resultSet = null;
		pst.setInt(1, id);
		resultSet = pst.executeQuery();

		if (resultSet.next()) {
			String name;
			String dob;
			float salary;
			System.out.println("Enter  name salary dob in  yyyy-MM-dd format to update ");
			scanner.nextLine();
			name = scanner.nextLine();
			salary = scanner.nextFloat();
			dob = scanner.next();

			pst = null;
			pst = connection.prepareStatement("update  employee  set name=?, salary=?, dob=? where emp_id=? ");
			pst.setString(1, name);
			pst.setFloat(2, salary);
			pst.setString(3, dob);
			pst.setInt(4, id);

			int x = pst.executeUpdate();
			if (x == 1)
				System.out.println("Record updated");
		} else
			System.out.println("Record not present with given id " + id);
	}

	void createTable() throws SQLException {
		statement.execute("create table survey(id int primary key, name varchar(20), location varchar(20)) ");
		System.out.println("table created");
	}

	void addRecord1() throws SQLException {
		int id;
		String name;
		String dob;
		float salary;
		// Date date;

		System.out.println("Enter id name salary date in  yyyy-MM-dd format ");
		id = scanner.nextInt();
		scanner.nextLine();
		name = scanner.nextLine();
		salary = scanner.nextFloat();
		dob = scanner.next();

		pst = connection.prepareStatement("insert into  employee   values(?,?,?,?)");
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setFloat(3, salary);
		pst.setString(4, dob);

		int res = pst.executeUpdate();

		if (res == 1)
			System.out.println("Record added");

	}


	void closeResources() throws SQLException {
		connection.close();
		statement.close();
		resultSet.close();
	}

}
