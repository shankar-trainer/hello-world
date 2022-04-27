package com.cognizant.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.EmployeeDao;
import com.cognizant.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public boolean saveEmployee(Employee emp1) {
	    if(emp1.getEmpId()<=0)
	    	throw new EmployeeException("invalid id");
	    else if(emp1.getEmpName().isBlank())
	    	throw new EmployeeException("invalid name");
	    
	    else if(emp1.getEmpSalary()<5000 || emp1.getEmpSalary()>10000) {
	    	 //System.out.println("salary is "+emp1.getEmpSalary());
	    	throw new EmployeeException("invalid salary");
	    }
	    else {
		if(dao.addEmployee(emp1)) {	
		return true;
	    }
	    else 
	    	return false;
	    }
	}

	@Override
	public Map<Integer, Employee> getAllEmployee() {
		if(dao.getAllEmployeeEmployee()==null) {
			throw new EmployeeException("i employee list is blank");
		}
		return dao.getAllEmployeeEmployee();
	}

}
