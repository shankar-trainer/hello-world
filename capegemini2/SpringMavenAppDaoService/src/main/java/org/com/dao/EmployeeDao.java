package org.com.dao;

import java.util.HashMap;
import java.util.Map;

import org.com.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	Map<Integer, Employee> empmap1;

	public EmployeeDao() {
		empmap1 = new HashMap<Integer, Employee>();
	}

	public boolean addEmployee(Employee employee) {
		if (searchEmployee(employee))
			return false;
		else {
			empmap1.put(employee.getId(), employee);
			return true;
		}
	}

	public boolean searchEmployee(Employee employee) {
		if (empmap1.keySet().contains(employee.getId()))
			return true;
		else
			return false;
	}

	public Map<Integer, Employee> showAllEmployee() {
		return empmap1;
	}
}
