package edu.lpu.collection.dao;

import java.util.ArrayList;
import java.util.List;

import edu.lpu.collection.bean.Employee;

public class EmployeeDao {

	List<Employee> empList;
	
	public EmployeeDao() {
	  empList=new ArrayList<>();
	}
	
	public void addEmployee(Employee e) {
		empList.add(e);
	}
	
	public List<Employee> getEmployee(){
		return empList;
	}
	
	public boolean searchEmployee(Employee emp) {
		return empList.contains(emp);
	}
}
