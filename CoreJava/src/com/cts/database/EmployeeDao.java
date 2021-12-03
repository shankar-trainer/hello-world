package com.cts.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.cts.database.model.Employee;

public class EmployeeDao {

	Connection connection;
	Statement st;
	ResultSet rs;
	List<Employee> empList;

	PreparedStatement pst;
	Employee emp;

	public EmployeeDao() throws SQLException {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "manager");
		st = connection.createStatement();
	}

	public boolean addEmployee(Employee emp) throws SQLException {
		if ((searchEmployee(emp.getId()) == null)) {
			pst = connection.prepareStatement("insert into employee values(?,?,?,?)");
			pst.setInt(1, emp.getId());
			pst.setString(2, emp.getName());
			pst.setFloat(3, emp.getSalary());
			pst.setString(4, emp.getLocation());

			pst.executeUpdate();
			return true;
		} else
			return false;
	}

	public Employee searchEmployee(int id) throws SQLException {
		rs = null;
		rs = st.executeQuery("select * from employee where id=" + id);
		if (rs.next()) {
			emp = null;
			emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			emp.setLocation(rs.getString(4));
			return emp;
		} else
			return null;
	}

	public List<Employee> getAllEmpployee() throws SQLException {
		empList = null;
		empList = new ArrayList<>();
		rs = st.executeQuery("select * from employee");

		while (rs.next()) {
			emp = null;
			emp = new Employee();
			emp.setId(rs.getInt(1));
			emp.setName(rs.getString(2));
			emp.setSalary(rs.getFloat(3));
			emp.setLocation(rs.getString(4));
			empList.add(emp);
		}
		return empList;
	}
}
