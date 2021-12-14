package org.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTask {

	Employee emp1 = null;
	static Statement st;
	static ResultSet rs, rs1;
	static PreparedStatement pst;

	static Connection con;

	static {
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "mysql");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

///	public boolean addRecord() {
		
	//}
	
	public static List<Employee> getEmployeeList() throws SQLException {
		List<Employee> list = new ArrayList<>();
		if (con == null)
			System.out.println("connection is null");

		st = con.createStatement();
		rs = st.executeQuery("select * from employee");
		Employee emp1 = null;

		while (rs.next()) {
			emp1 = new Employee();
			emp1.setId(rs.getInt(1));
			emp1.setName(rs.getString(2));
			emp1.setSalary(rs.getFloat(3));
			emp1.setCity(rs.getString(4));
			list.add(emp1);
		}
		return list;
	}
}
