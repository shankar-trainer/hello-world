package com.cognizant.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.exception.EmployeeException;
import com.cognizant.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao dao;

	@Override
	public boolean saveEmployee(Employee emp) throws EmployeeException {
		if (dao.addEmployee(emp) == false)
			throw new EmployeeException("employee  with id already present");

		return true;
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeException {
		if (dao.searchEmployee(id) == null)
			throw new EmployeeException("not found");
		return dao.searchEmployee(id);
	}

	@Override
	public Map<Integer, Employee> retrieveAllEmployee() throws EmployeeException {
		if (dao.getAllEmployee().size() == 0)
			throw new EmployeeException("list is empty");
		return dao.getAllEmployee();
	}

}
