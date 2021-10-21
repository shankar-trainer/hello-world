package com.cg.eis.service;

import java.util.HashMap;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	HashMap<Integer, Employee> empMap;

	public EmployeeServiceImpl() {
		empMap = new HashMap<>();
	}

	@Override
	public void EmployeeDetail(Employee employee) {
		empMap.put(employee.getId(), employee);
	}

	@Override
	public String FindInsuranceScheme(float salary, String designation) {
		for (int key : empMap.keySet()) {
			Employee emp1 = empMap.get(key);
			if (emp1.getDesignation().equals(designation) && (emp1.getSalary() == salary))
				return emp1.getInsuranceSCheme();
		}
		return null;
	}

	@Override
	public String FindInsuranceScheme1(int id) {
		Employee emp1 = empMap.get(id);
		return emp1.getInsuranceSCheme();
	}

	@Override
	public void displayDetail(int id) {
		Employee emp = empMap.get(id);
		System.out.println("Employee Detail");
		// System.out.println(emp.getId()+" "+emp.getName()+" ");
		System.out.println(emp);
	}

}
