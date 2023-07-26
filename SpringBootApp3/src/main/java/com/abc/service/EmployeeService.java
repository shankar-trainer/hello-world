package com.abc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.EmployeeRepository;
import com.abc.exception.EmployeeException;
import com.abc.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository dao;

	public Employee addEmployee(Employee employee) throws EmployeeException {

		Optional<Employee> findById = dao.findById(employee.getEmpId());
		if (!findById.isPresent())
			return dao.save(employee);
		else
			throw new EmployeeException("employee already present");
	}

	public Employee searchEmployee(int id) throws EmployeeException {
		Optional<Employee> findById = dao.findById(id);
		if (findById.isPresent())
			return findById.get();
		else
			throw new EmployeeException("employee not  present");
	}

	public Employee updateEmployee(Employee emp) throws EmployeeException {
		Optional<Employee> findById = dao.findById(emp.getEmpId());
		if (findById.isPresent()) {
			Employee e = findById.get();
			dao.save(emp);
			return e;
		} else
			throw new EmployeeException("employee not  found");

	}

	public Employee deleteEmployee(int id) throws EmployeeException {
		Optional<Employee> findById = dao.findById(id);
		if (findById.isPresent()) {
			Employee employee = findById.get();
			dao.delete(findById.get());
			return employee;
		} else
			throw new EmployeeException("employee not found");
	}

	public List<Employee> getAllEmployee() throws EmployeeException {
		if(dao.findAll().size()==0)
				throw new EmployeeException("employee list is empty");
		else
		return dao.findAll();
	}
}
