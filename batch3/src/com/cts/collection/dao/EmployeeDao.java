package com.cts.collection.dao;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDao {

	Set<Employee> emp_set;

	public EmployeeDao() {
		emp_set = new HashSet<Employee>();
	}

	public void addEmployee(Employee emp) {
		emp_set.add(emp);
	}

	public Set<Employee> getEmployee() {
		return emp_set;
	}

	public Employee searchEmployee(Employee employee) throws EmployeeException {
		for (Employee e : emp_set) {
			if (e.equals(employee))
				return e;
		}
		throw new EmployeeException("Search Employee not present");
	}

	public boolean deleteEmployee(Employee employee) throws EmployeeException {
		if (emp_set.contains(employee)) {
			emp_set.remove(employee);
			return true;
		} else
			throw new EmployeeException("employee not present ");
	}

}
