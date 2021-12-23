package com.cognizant.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcProgram2 {
	Statement st;
	Connection con;
	ResultSet rs;
	ResultSetMetaData metaData;
	Scanner sc;
	Employee employee;
	PreparedStatement pst1, pst2;

	public JdbcProgram2() throws SQLException, ClassNotFoundException {
		// DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Class.forName("oracle.jdbc.OracleDriver");
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		// st = con.createStatement();
		con.setAutoCommit(false);
		st = con.createStatement();
		sc = new Scanner(System.in);
	}

	Employee searchEmployee(int id) throws SQLException {
		employee = null;
		pst1 = null;
		pst1 = con.prepareStatement("select * from employee where id=?");
		pst1.setInt(1, id);
		rs = null;

		rs = pst1.executeQuery();

		if (rs.next()) {
			employee = new Employee();
			employee.setId(rs.getInt(1));
			employee.setName(rs.getString(2));
			employee.setSalary(rs.getFloat(3));
			return employee;
		} else
			return employee;
	}

	void addRecord1() throws SQLException {
		Employee employee1 = new Employee();

		System.out.println("Enter id");
		employee1.setId(sc.nextInt());

		System.out.println("Enter Name");
		sc.nextLine();
		employee1.setName(sc.nextLine());

		System.out.println("Enter Salary");
		employee1.setSalary(sc.nextFloat());

		if (searchEmployee(employee1.getId()) == null) {
			pst2 = con.prepareStatement("insert into employee values(?,?,?)");
			pst2.setInt(1, employee1.getId());
			pst2.setString(2, employee1.getName());
			pst2.setFloat(3, employee1.getSalary());

			int x = pst2.executeUpdate();
			System.out.println("Save Record y\\n");
			String ch = sc.next();
			if (ch.equals("y")) {
				con.commit();
				System.out.println("Record Inserted");
			} else {
				con.rollback();
				System.out.println("Record Not Saved");
			
			}
		} else
			System.out.println("Record with id " + employee.getId() + " already present");
	}

	void addRecord() throws SQLException {
		employee = null;
		employee = new Employee();

		System.out.println("Enter id");
		employee.setId(sc.nextInt());

		System.out.println("Enter Name");
		sc.nextLine();
		employee.setName(sc.nextLine());

		System.out.println("Enter Salary");
		employee.setSalary(sc.nextFloat());

		int x = st.executeUpdate("insert into employee values(" + employee.getId() + ",'" + employee.getName() + "',"
				+ employee.getSalary() + ")");
		if (x == 1)
			System.out.println("Record Inserted");
	}

	void getAllRecord() throws SQLException {
		rs = st.executeQuery("select * from employee");

		metaData = rs.getMetaData();
		int colcount = metaData.getColumnCount();

		for (int x = 1; x <= colcount; x++)
			System.out.print(metaData.getColumnName(x) + "    ");

		System.out.println();

		while (rs.next())
			System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getFloat(3));
	}
}
