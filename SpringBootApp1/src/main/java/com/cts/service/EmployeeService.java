package com.cts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.EmployeeDao;
import com.cts.exception.EmployeeException;
import com.cts.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao dao;
	
	public void savemployee(Employee emp) throws EmployeeException {
	
		if( dao.showAllEmployee().contains(emp))
			 throw new EmployeeException("employee already present");
		else 
			dao.addEmployee(emp);
	}
	
	public List<Employee> getAllEmployee() throws EmployeeException{
		if(dao.showAllEmployee().size()==0)
			 throw new EmployeeException("no employee exist in the list");
		else
			return dao.showAllEmployee();
	}
	
}
