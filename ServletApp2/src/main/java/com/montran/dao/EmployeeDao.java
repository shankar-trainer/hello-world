package com.montran.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.montran.model.Employee;

public class EmployeeDao {

	private Connection connection;
	private PreparedStatement pst,pst1;
	private Statement st;
	private ResultSet rs;
	private List<Employee> empList;
	private Employee employee;

	public EmployeeDao() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/montran", "root", "mysql");

	}

	public boolean addEmployee(Employee emp) throws SQLException {
		
		pst1 = connection.prepareStatement("select * from  employee where emp_id=?");
		pst1.setInt(1, emp.getEmpId());
		rs=null;
		
		rs=pst1.executeQuery();
		if(!rs.next()) {
		pst = connection.prepareStatement("insert into employee values(?,?,?,?)");
		pst.setInt(1, emp.getEmpId());
		pst.setString(2, emp.getEmpName());
		pst.setFloat(3, emp.getEmpSalary());

		pst.setDate(4, new java.sql.Date(emp.getEmpDob().getTime()));

		if (pst.executeUpdate() == 1)
			return true;
		}
			return false;

	}

	public List<Employee> getAllEmloyee() throws SQLException {
		st = connection.createStatement();
		rs = st.executeQuery("select * from employee");
		empList = null;
		empList = new ArrayList<Employee>();

		while (rs.next()) {
			employee = null;
			employee = new Employee();
			employee.setEmpId(rs.getInt(1));
			employee.setEmpName(rs.getString(2));
			employee.setEmpSalary(rs.getFloat(3));
			employee.setEmpDob(rs.getDate(4));
			empList.add(employee);
		}
		return empList;
	}

}
