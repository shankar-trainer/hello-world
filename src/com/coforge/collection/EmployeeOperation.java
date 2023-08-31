package com.coforge.collection;

import java.util.ArrayList;
import java.util.List;

public class EmployeeOperation {

	List<Employee> empList;

	public EmployeeOperation() {
		empList = new ArrayList<Employee>();
	}

	public List<Employee> getAllEmployees() {
		return empList;
	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	public boolean removeEmployee(Employee emp) {
		if (empList.contains(emp)) {
			empList.remove(emp);
			return true;
		}
		return false;
	}

	public boolean removeEmployee(int index) {
	
		for (int i = 0; i < empList.size(); i++) {
			if(i==index) {
				empList.remove(index);
				return true;
			}
		}
		return false;
	}

}
