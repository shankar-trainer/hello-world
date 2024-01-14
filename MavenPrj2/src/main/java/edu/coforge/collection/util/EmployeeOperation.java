package edu.coforge.collection.util;

import java.util.ArrayList;
import java.util.List;

import edu.coforge.collection.model.Employee;

public class EmployeeOperation {

	List<Employee> empList;
	
	public EmployeeOperation() {
		empList=new ArrayList<>();
	}
	
	public void addEmployee(Employee e ) {
	 empList.add(e);	
	}
	
	public void removeEmployee(Employee e ) {
		empList.remove(e);	
	}
	
	public void removeEmployee(int index ) {
		empList.remove(index);	
	}
	
	public Employee searchEmployee(Employee e) {
		if(empList.contains(e)) {
			for (Employee employee : empList) {
				if(employee.equals(e));
				return e;
			}
		}
		return null;
	}
	
	public List<Employee> getAllEmployee(){
		return empList;
	}
	
}
