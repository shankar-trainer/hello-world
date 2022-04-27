package com.cognizant.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	Map<Integer, Employee> empMap;

	public EmployeeDaoImpl() {
		empMap = new HashMap<>();
	}

	@Override
	public boolean addEmployee(Employee emp) {
		if (searchEmployee(emp.getEmpId()) == null) {
			empMap.put(emp.getEmpId(), emp);
			return true;
		}
		return false;
	}

	@Override
	public Employee searchEmployee(int id) {
		if (empMap.containsKey(id))
			return empMap.get(id);
		return null;
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		return empMap;
	}

}
