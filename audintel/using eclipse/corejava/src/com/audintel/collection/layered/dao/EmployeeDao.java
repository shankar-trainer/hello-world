package com.audintel.collection.layered.dao;

import java.util.HashMap;
import java.util.Map;

import com.audintel.collection.layered.domain.Employee;
import com.audintel.collection.layered.exception.EmployeeException;

public interface EmployeeDao {

	public Employee addEmployee(Employee employee) throws EmployeeException;
	public Map<Integer, Employee> getAllEmployee() throws EmployeeException;
	public Employee searchEmployee(int id) throws EmployeeException;
	public Employee deleteEmployee(int id) throws EmployeeException;
	public Employee updateEmployee(Employee employee) throws EmployeeException;
	Employee searchEmployee1(int id) throws EmployeeException;
}
