package com.abc.webservice;

import java.sql.SQLException;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.abc.model.Employee;

@WebService
public interface EmployeeService {
	public List<Employee> getEmployeeList() throws SQLException;
	public Employee searchEmployee(@WebParam(name = "employeeId") int id) throws SQLException;
}
