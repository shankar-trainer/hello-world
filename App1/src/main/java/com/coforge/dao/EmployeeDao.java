package com.coforge.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.coforge.model.Employee;
import com.coforge.util.ConnectionUtil;

public class EmployeeDao {

	Connection connection;
	Statement statement;
	PreparedStatement preparedStatement;
	ResultSet resultSet;

	public EmployeeDao() throws SQLException {
		connection = ConnectionUtil.userConnection();
	}

	public boolean addEmployee(Employee employee) throws SQLException {
		if (searchEmployee(employee.getId()) == null) {
			preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
			preparedStatement.setInt(1, employee.getId());
			preparedStatement.setString(2, employee.getName());
			preparedStatement.setFloat(3, employee.getSalary());
			preparedStatement.executeUpdate();
			return true;
		}
		return false;
	}

	public Employee searchEmployee(int id) throws SQLException {
		preparedStatement = connection.prepareStatement("select * from employee where id=?");
		preparedStatement.setInt(1, id);

		resultSet = preparedStatement.executeQuery();
		Employee employee = null;

		if (resultSet.next()) {
			employee = new Employee();
			employee.setId(resultSet.getInt(1));
			employee.setName(resultSet.getString(2));
			employee.setSalary(resultSet.getFloat(3));
		}
		return employee;
	}

	List<Employee> empList;

	public List<Employee> getAllEmployee() throws SQLException {
		statement = connection.createStatement();
		resultSet = null;
		resultSet = statement.executeQuery("select * from employee");

		empList = null;
		empList = new ArrayList<>();

		Employee employee = null;

		while (resultSet.next()) {
			employee = new Employee();
			employee.setId(resultSet.getInt(1));
			employee.setName(resultSet.getString(2));
			employee.setSalary(resultSet.getFloat(3));
			empList.add(employee);
		}
		return empList;
	}

}
