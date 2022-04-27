package com.cognizant.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	Map<Integer, Employee> map1;
	Employee emp1;

	public EmployeeDaoImpl() {
		map1 = new HashMap<>();
	}

	@Override
	public boolean addEmployee(Employee emp) {
		if (searchEmployee(emp.getEmpId()) != null)
			return false;
		else {
			map1.put(emp.getEmpId(), emp);
			return true;
		}
	}

	public Employee searchEmployee(int id) {
		if (map1.keySet().contains(id)) {
			emp1 = map1.get(id);
			return emp1;
		}
		return null;
	}

	@Override
	public Map<Integer, Employee> getAllEmployeeEmployee() {
		return map1;
	}

}
