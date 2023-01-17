package com.abc.collection.dao;

import java.util.ArrayList;
import java.util.List;

import com.abc.collection.bean.Employee;

public class EmployeeDao {

	List<Employee> employeeList;

	public EmployeeDao() {
		employeeList = new ArrayList<>();
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
	}

	public boolean updateEmployeeById(Employee employee) {
         boolean status=false;
		for (int x = 0; x < employeeList.size(); x++) {
			if (employeeList.get(x).getEmpId() == employee.getEmpId()) {

				Employee emp1 = employeeList.get(x);
				emp1.setEmpName(employee.getEmpName());
				emp1.setEmpSalary(employee.getEmpSalary());

				employeeList.remove(x);
				employeeList.add(x, emp1);
				status=true;
				break;
			}
		}
		return status;
	}
	
	public List<Employee> showAllEmployee() {
	  return employeeList;
	}

	public Employee searchEmployee(Employee employee) {
		if (employeeList.contains(employee))
			return employee;

		return null;
	}

	public boolean removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			return true;
		}

		return false;
	}

}
