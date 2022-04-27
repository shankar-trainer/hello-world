package com.cognizant.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EmployeeDaoImpl;
import com.cognizant.exception.EmployeException;
import com.cognizant.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDaoImpl dao;

	public void saveEmployee(Employee emp) throws EmployeException {
		if (emp == null)
			throw new EmployeException("employee is null");
		else if (emp.getId() <= 0)
			throw new EmployeException("id  is  invalid");

		else if (emp.getName() == null)
			throw new EmployeException("name   is  invalid");

		else if (emp.getName().isEmpty())
			throw new EmployeException("name   is  blank");

		else if (emp.getSalary() <= 0)
			throw new EmployeException("salary is  invalid");
		else
			dao.addEmployee(emp);

	}

	public List<Employee> getAllEmployee() throws EmployeException {
		if (dao.getAllEmployee().size() == 0)
			throw new EmployeException("employee list is empty");
		else
			return dao.getAllEmployee();
	}

}
