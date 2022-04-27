package com.cognizant.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	List<Employee> empList;
	
	public EmployeeDaoImpl() {
	  empList=new ArrayList<Employee>();
	}
	
	public void addEmployee(Employee emp) {
       empList.add(emp);		
	}

	public List<Employee> getAllEmployee() {
		return empList;
	}

}
