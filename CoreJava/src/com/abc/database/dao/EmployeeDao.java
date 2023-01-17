package com.abc.database.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import com.abc.database.model.Employee;
import com.abc.database.util.DatabaseUtil;

public class EmployeeDao {

	Connection connection;
	ResultSet resultSet;
	Statement statement;
	PreparedStatement preparedStatement;
	Set<Employee> employeeSet;
	Employee employee;
	ResultSetMetaData metaData;
	CallableStatement callableStatement;

	public EmployeeDao() throws SQLException {
		connection = DatabaseUtil.myDatabaseConnection();
	}

//		CallableStatement callableStatement=connection.prepareCall("{call searchemployee(?,?,?)}");
	public Employee searchEmployeeRecord1(int id) throws SQLException {

		callableStatement = connection.prepareCall("{call searchemployee(?,?,?)}");
		callableStatement.setInt(1, id);
		callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
		callableStatement.registerOutParameter(3, java.sql.Types.FLOAT);

		callableStatement.execute();
		String name = callableStatement.getString(2);
		float salary = callableStatement.getFloat(3);
		if (name == null || salary == 0) {
			return null;
		} else {
			employee = new Employee();
			employee.setId(id);
			employee.setName(name);
			employee.setSalary(salary);
			return employee;
		}

	}

	public void getAllFieldName() throws SQLException {
		metaData = resultSet.getMetaData();
		for (int i = 1; i <= metaData.getColumnCount(); i++) {
			System.out.print(metaData.getColumnName(i) + "\t");
		}
		System.out.println();
	}

	public boolean removeEmployeeRecord(int id) throws SQLException {
		if (searchEmployeeRecord(id) != null) {
			preparedStatement = null;
			preparedStatement = connection.prepareStatement("delete from employee where id=?");
			preparedStatement.setInt(1, id);
			preparedStatement.executeUpdate();
			return true;
		}
		return false;
	}

	public boolean updateEmployeeRecord(Employee employee) throws SQLException {
		if (searchEmployeeRecord(employee.getId()) != null) {
			preparedStatement = null;
			preparedStatement = connection.prepareStatement("update employee set name=? , salary=? where id=?");
			preparedStatement.setString(1, employee.getName());
			preparedStatement.setFloat(2, employee.getSalary());
			preparedStatement.setInt(3, employee.getId());
			preparedStatement.executeUpdate();

			return true;
		}
		return false;
	}

	public Set<Employee> getAllEmployee() {
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from employee");
			employeeSet = null;
			employeeSet = new HashSet<>();

			while (resultSet.next()) {
				employee = null;
				employee = new Employee();
				employee.setId(resultSet.getInt(1));
				employee.setName(resultSet.getString(2));
				employee.setSalary(resultSet.getFloat(3));
				employeeSet.add(employee);
			}
		} catch (SQLException e) {
			System.err.println(e);
		}
		return employeeSet;
	}

	public Employee searchEmployeeRecord(int id) throws SQLException {
		statement = connection.createStatement();
		resultSet = null;
		resultSet = statement.executeQuery("select * from employee where id=" + id);
		if (resultSet.next()) {
			employee = null;
			employee = new Employee();
			employee.setId(resultSet.getInt(1));
			employee.setName(resultSet.getString(2));
			employee.setSalary(resultSet.getFloat(3));
			return employee;
		}
		return null;
	}

	public boolean addEmployeeRecord(Employee employee) throws SQLException {
		if (searchEmployeeRecord(employee.getId()) == null) {
			statement = null;

			statement = connection.createStatement();
			int result = statement.executeUpdate("insert into employee values(" + employee.getId() + ",'"
					+ employee.getName() + "'," + employee.getSalary() + ")");
			return true;
		}
		return false;
	}
}
