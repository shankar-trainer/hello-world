package com.coforge.dao;

import com.coforge.exception.EmployeeException;
import com.coforge.model.Employee;
import com.coforge.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao {

    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;

    public EmployeeDao() throws SQLException {
        connection = DatabaseConnection.myConnection();
        if (connection != null)
            System.out.println("connection successful");
        else
            System.out.println("----- some problem");
    }

    public List<Employee> getAllEmployee() throws EmployeeException, SQLException {
        statement = connection.createStatement();
        resultSet = null;
        resultSet = statement.executeQuery("select * from employee");
        List<Employee> employeeList = new ArrayList<>();
        while (resultSet.next()) {
            Employee employee1 = new Employee();
            employee1.setEmpolyeeId(resultSet.getInt(1));
            employee1.setEmpolyeeName(resultSet.getString(2));
            employee1.setEmpolyeeSalary(resultSet.getFloat(3));
            employeeList.add(employee1);
        }
        if (employeeList.isEmpty())
            throw new EmployeeException("list is empty");
        else
            return employeeList;

    }

    public Employee addEmployee(Employee employee) throws SQLException, EmployeeException {
        preparedStatement = null;
        preparedStatement = connection.prepareStatement("select * from employee where id=?");
        preparedStatement.setInt(1, employee.getEmpolyeeId());
        resultSet = null;
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            throw new EmployeeException("id already present");
        } else {
            preparedStatement = connection.prepareStatement("insert into employee values(?,?,?)");
            preparedStatement.setInt(1, employee.getEmpolyeeId());
            preparedStatement.setString(2, employee.getEmpolyeeName());
            preparedStatement.setFloat(3, employee.getEmpolyeeSalary());
            int i = preparedStatement.executeUpdate();
            if (i == 1)
                return employee;
        }
        return null;
    }

    public Employee searchEmployee(int id) throws SQLException, EmployeeException {
        preparedStatement = null;
        preparedStatement = connection.prepareStatement("select * from employee where id=?");
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Employee employee = new Employee();
            employee.setEmpolyeeId(resultSet.getInt(1));
            employee.setEmpolyeeName(resultSet.getString(2));
            employee.setEmpolyeeSalary(resultSet.getFloat(3));
            return employee;
        } else throw new EmployeeException("id not  present");
    }

}
