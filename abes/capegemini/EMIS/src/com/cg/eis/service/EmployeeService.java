package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public interface EmployeeService {

	void EmployeeDetail(Employee employee);
	String  FindInsuranceScheme(float salary, String designation);
	String  FindInsuranceScheme1(int id);
    void displayDetail(int id);
	
	
}
