package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import com.cts.dao.EmployeeDao;
import com.cts.exception.EmployeeException;
import com.cts.model.Employee;

@Service
@ComponentScan("com.cts.dao")
public class EmployeeService {

	// Service layer uses dao 
	// Service deals with errors, communicates with client(presentation)
	
	@Autowired
	EmployeeDao dao;
	
	public List<Employee> getEmplList() {
		if(dao.getAllEmployees().size()==0)
			throw new EmployeeException("employee list is empty");
		
		return dao.getAllEmployees();
	}
	
	public boolean addEmployee(Employee employee) {
		if(dao.getAllEmployees().contains(employee))
			throw new EmployeeException("employee already present");
		
		dao.addEmployee(employee);
		return true;
	}
	
	public Employee searchEmployeeById(int id) {
	
		if(dao.searchEmployeeById(id)==null) {
			 throw new EmployeeException("employee not present with id "+id);
		}
		else {
			return dao.searchEmployeeById(id);
		}
	}

	public boolean removeEmployeeById(int id) {
		if(dao.removeEmployeeById(id)) 
			return true;
		else 
			throw new EmployeeException("employee not present with id "+id);
	}

	public boolean updateEmployee(Employee emp) {
		if(dao.updateEmployee(emp))
			return true;
		else 
			throw new EmployeeException("employee not present ");
	}
	

}
