package com.coforge.collection.dao;

import java.util.HashSet;
import java.util.Set;

import com.coforge.collection.model.Employee;

public class EmployeeOperation {

	Set<Employee> employeeSet;

	public EmployeeOperation() {
		employeeSet = new HashSet<>();
	}

	public boolean addEmployee(Employee emp) {
		if (searchEmployee(emp) == null) {
			employeeSet.add(emp);
			return true;
		}
		return false;
	}

	public Employee searchEmployee(Employee emp) {

		if (employeeSet.contains(emp))
			return emp;
		return null;
	}

	public Set<Employee> getAllEmployee() {
		return employeeSet;
	}

}
