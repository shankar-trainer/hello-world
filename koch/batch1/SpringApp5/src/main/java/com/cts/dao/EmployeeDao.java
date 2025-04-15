package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.exception.EmployeeException;
import com.cts.model.Employee;

@Repository
public class EmployeeDao {

	List<Employee> emplList = new ArrayList<>();

	public List<Employee> getEmplList() {
		return emplList;
	}

	public void setEmplList(List<Employee> emplList) {
		this.emplList = emplList;
	}

	public boolean addEmployee(Employee employee) {
//		if(emplList.contains(employee))
//			throw new EmployeeException("employee already present");

		emplList.add(employee);
		return true;
	}

	public List<Employee> getAllEmployees() {
		return emplList;
	}
	// searchEmployeeById, updateEmployee ,removeEmployeeById

	public Employee searchEmployeeById(int id) {
		return emplList.stream().filter(a -> a.getEmpId() == id).findFirst().get();
	}

	public boolean removeEmployeeById(int id) {

		Employee e1 = emplList.stream().filter(a -> a.getEmpId() == id).findFirst().get();
		if(e1!=null) {
		emplList.remove(e1);
		 return true;
		}
		else {
			return false;
		}
	}

	public boolean updateEmployee(Employee emp) {
		
		Employee e1 = emplList.stream().filter(a -> a.getEmpId() == emp.getEmpId()).findFirst().get();
		if(e1!=null) {
			emplList.remove(e1);
			emplList.add(e1);
			return true;
		}
		return false;

	}

}
