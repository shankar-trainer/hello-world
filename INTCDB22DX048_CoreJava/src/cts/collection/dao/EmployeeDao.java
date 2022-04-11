package cts.collection.dao;

import java.util.HashSet;
import java.util.Set;

import cts.collection.model.Employee;

public class EmployeeDao {

	private Set<Employee> empSet;

	public EmployeeDao() {
		empSet = new HashSet<>();
	}

	public Set<Employee> getAllEmployee() {
		return empSet;
	}

	public boolean addEmployee(Employee e) {
		if (empSet.contains(e))
			return false;
		else {
			empSet.add(e);
			return true;
		}
	}
	public boolean removeEmployee(Employee e) {
		if (empSet.contains(e)) {
			empSet.remove(e);
			return true;
		}
		else {
			return false;
		}
	}

	public Employee searchEmployee(Employee e) {

		for (Employee ee : empSet) {
			if (ee.equals(e))
				return ee;
		}
		return null;
	}

}
