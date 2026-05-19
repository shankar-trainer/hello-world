package com.montran.database.dao;

import java.sql.SQLException;
import java.util.Map;

public class EmployeeMain {

	public static void main(String[] args) {

		try {
			EmployeeDao dao = new EmployeeDao();
			Map<Integer, Employee> empMap = dao.showAllEmployee();

			System.out.println("All Employee");
			for (Integer i : empMap.keySet()) {
				Employee employee = empMap.get(i);
				System.out.println(employee.getEmpId() + "  " + employee.getEmpName() + "  " + employee.getEmpSalary()
						+ "  " + employee.getEmpDob());
			}

			System.out.println("search Employee");
			Employee searchEmployee = dao.searchEmployee(6666);
			if (searchEmployee != null) {
				System.out.println("\nEmployee found  \n");
				System.out.println(searchEmployee.getEmpId() + "  " + searchEmployee.getEmpName() + "  "
						+ searchEmployee.getEmpSalary() + "  " + searchEmployee.getEmpDob());
			} else
				System.out.println("\nEmployee not  found  \n");

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
