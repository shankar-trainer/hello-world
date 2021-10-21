package org.com.dao;

import java.util.List;

import org.com.capegemini.controller.Employee;
import org.com.model.Student;

public interface EmployeeDao {
	public boolean store(Employee emp);

	public boolean delete(Integer empId);

	public Employee findById(Integer empId);

	public List<Employee> findAll();
}