package com.coforge.dao;

import java.util.List;

import com.coforge.model.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);
	
}
