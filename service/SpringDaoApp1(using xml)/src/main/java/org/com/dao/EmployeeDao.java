package org.com.dao;

import java.util.List;

import org.com.model.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployee();
	public void addEmployee(Employee e);

}
