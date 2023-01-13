package com.audintel.collection.layered.dao;

import java.util.HashMap;
import java.util.Map;

import com.audintel.collection.layered.domain.Employee;
import com.audintel.collection.layered.exception.EmployeeException;


public class EmployeeDaoImpl implements EmployeeDao {
	private Map<Integer, Employee> empMap;

	public EmployeeDaoImpl() {
		empMap = new HashMap<>();
	}

	@Override
	public Employee addEmployee(Employee employee) throws EmployeeException {
		if (searchEmployee1(employee.getEmpId()) == null)
			return empMap.put(employee.getEmpId(), employee);
		else
			throw new EmployeeException("id already present");
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() throws EmployeeException {
		if (empMap.size() == 0)
			throw new EmployeeException("no record present");
		return empMap;
	}

	@Override
	public Employee searchEmployee(int id) throws EmployeeException {
		if (empMap.containsKey(id))
			return empMap.get(id);
		else {
		 throw new EmployeeException("id not found");
		}
	}
	@Override
	public Employee searchEmployee1(int id) throws EmployeeException {
		if (empMap.containsKey(id))
			return empMap.get(id);
		else {
			return null;
		}
	}

	@Override
	public Employee deleteEmployee(int id) throws EmployeeException {
		if (searchEmployee1(id) != null)
			return empMap.remove(id);
		else
			throw new EmployeeException("id not  present");
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		if (searchEmployee1(employee.getEmpId()) != null) {
			empMap.put(employee.getEmpId(), employee);
			return employee;
		} else
			throw new EmployeeException("id not  present");
	}

}
