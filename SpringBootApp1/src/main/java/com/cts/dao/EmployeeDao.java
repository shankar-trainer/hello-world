package com.cts.dao;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.cts.model.Employee;

@Repository
public class EmployeeDao {

	List<Employee> empList;

	public EmployeeDao() {
		empList = new ArrayList<Employee>();
	}

	public void addEmployee(Employee emp) {
		empList.add(emp);
	}

	public List<Employee> showAllEmployee() {
		return empList;
	}

}
