package org.com.capegemini.service;

import java.util.List;
import java.util.Scanner;

import org.com.capegemini.dao.EmployeeDao;
import org.com.capegemini.dao.EmployeeDaoImpl;
import org.com.capegemini.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	Employee emp;
	List<Employee> emplist;
	EmployeeDao dao;

	public EmployeeServiceImpl() {
	 		dao = new EmployeeDaoImpl();
	}

	@Override
	public void saveEmployee(Employee e) {
		if(dao.addEmployee(e))
			System.out.println("Employee added successfully");
		else
			System.out.println("Employee cannot be added\nEmployee exist in data base");
	}

	@Override
	public void deleteEmployee(Employee e) {
		if(dao.removeEmployee(e))
			System.out.println("Employee removed successfully");
		else
			System.out.println("Employee  doesnot exist in data base");
	}

	@Override
	public void findEmployee(int id) {
		emp = null;
		emp = dao.searchEmployee(id);
		if (emp == null)
			System.out.println("Employee not found");
		else {
      System.out.println("Employee found\n"+emp);
		}

	}

	@Override
	public void showAllEmployee() {
		emplist = null;
		emplist = dao.getAllEmployee();
		for (Employee e : emplist)
			System.out.println(e);
	}

	@Override
	public void changeEmployee(Employee e) {
	 if(dao.updateEmployee(e))
		 System.out.println("employee updated");
	 else
		 System.out.println("employee id not present");
	}

}
