package com.coforge.database;

import java.sql.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeDao {
    Map<Integer, Employee> employeeMap;
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;

    public EmployeeDao() throws SQLException {

        //1st way to  load driver
        // Class.forName("com.mysql.cj.jdbc.Driver");
        //2nd way to  load driver
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/coforge", "root", "mysql");
    }

    public boolean addEmployee(Employee emp) throws SQLException {
        if(searchEmployeeById(emp.getId())==null) {
            statement = connection.createStatement();
            int r = statement.executeUpdate("insert into employee values(" + emp.getId() + ",'" + emp.getName() + "'," + emp.getSalary() + ")");
            if (r == 1)
                return true;
        }
        return false;
    }

    public Employee searchEmployeeById(int id) throws SQLException {
        Map<Integer, Employee> empMap = getAllEmployees();
        if (empMap.containsKey(id))
            return empMap.get(id);

        return null;
    }

    public Map<Integer, Employee> getAllEmployees() throws SQLException {
        resultSet = null;
        statement = connection.createStatement();
        resultSet = statement.executeQuery("select * from employee");
        employeeMap = null;
        employeeMap = new HashMap<>();

        while (resultSet.next()) {
            Employee employee = new Employee();
            employee.setId(resultSet.getInt(1));
            employee.setName(resultSet.getString(2));
            employee.setSalary(resultSet.getFloat(3));
            employeeMap.put(employee.getId(), employee);
        }
        return employeeMap;
    }
}
/*
DAO

data access object


 */