package com.montran.database.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import com.montran.database.util.DatabaseUtil;

public class EmployeeDao {

	Map<Integer, Employee> empMap;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	CallableStatement cst;
	Connection connection;
	Employee employee;

	public EmployeeDao() throws SQLException {
		empMap = new HashMap<Integer, Employee>();
		connection = DatabaseUtil.myConnection();
	}

	public boolean addEmployee(Employee employee) {
           return false;
	}

	public boolean updateEmployee(Employee employee) {
		return false;
	}

	public boolean removeEmployee(int id) {
		return false;
	}

	public Employee searchEmployee(int id) throws SQLException {
		pst = connection.prepareStatement("select * from employee where emp_id=?");
		pst.setInt(1, id);
		rs = null;
		rs = pst.executeQuery();
		if (rs.next()) {
			employee = null;
			employee = new Employee();
			employee.setEmpId(rs.getInt(1));
			employee.setEmpName(rs.getString(2));
			employee.setEmpSalary(rs.getFloat(3));
			employee.setEmpDob(rs.getDate(4));
			return employee;
		}
		return null;
	}

	public Map<Integer, Employee> showAllEmployee() throws SQLException {
		st = connection.createStatement();
		rs = null;
		rs = st.executeQuery("select * from employee");
		empMap = null;
		empMap = new HashMap<Integer, Employee>();
		while (rs.next()) {
			employee = null;
			employee = new Employee();
			employee.setEmpId(rs.getInt(1));
			employee.setEmpName(rs.getString(2));
			employee.setEmpSalary(rs.getFloat(3));
			employee.setEmpDob(rs.getDate(4));
			empMap.put(employee.getEmpId(), employee);
		}
		return empMap;
	}

}
