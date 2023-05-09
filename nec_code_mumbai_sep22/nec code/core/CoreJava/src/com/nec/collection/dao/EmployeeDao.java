package com.nec.collection.dao;

import java.util.ArrayList;
import java.util.List;

import com.nec.collection.model.Employee;

public class EmployeeDao {

	private List<Employee> empList;

	public EmployeeDao() {
		empList = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		empList.add(employee);
	}

	public boolean removeEmployee(Employee employee) {
		if (empList.contains(employee))
			return empList.remove(employee);
		else
			return false;
	}

	public boolean searchEmployee(Employee employee) {
		return empList.contains(employee);
	}

	public boolean updateEmployee(Employee employee) {
		for (Employee e : empList) {

			if (e.getId() == employee.getId()) {
				e.setName(employee.getName());
				e.setSalary(e.getSalary());
				return true;
			}
		}
		return false;
	}

	public List<Employee> getAllEmployee() {
		return empList;
	}

}
