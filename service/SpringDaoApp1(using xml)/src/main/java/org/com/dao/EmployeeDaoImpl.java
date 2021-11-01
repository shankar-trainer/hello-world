package org.com.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.com.model.Employee;
import org.springframework.stereotype.Repository;


//@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> empList;

	public EmployeeDaoImpl(){
		empList=new ArrayList<>();
	}
	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public List<Employee> getAllEmployee() {
		return empList;
	}

	@Override
	public void addEmployee(Employee e) {
      empList.add(e);
	}
}
