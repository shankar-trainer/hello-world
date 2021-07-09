package cts.collection.dao;

import java.util.HashSet;
import java.util.Set;

public class EmployeeDao {

	Set<Employee> empSet;
	
	public EmployeeDao() {
	 empSet=new HashSet<Employee>();
	}
	
	public void addEmployee(Employee employee) {
		empSet.add(employee);
	}
	public void removeEmployee(Employee employee) {
		empSet.remove(employee);
	}
	
	public Set<Employee> getAllEmployee(){
		return empSet;
	}
	
	public Employee searchEmployee(Employee employee) {
		for (Employee employee1 : empSet) {
			if(employee1==employee)
				return employee;
		}
		return null;
	}
	
}
