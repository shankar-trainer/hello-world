package collection;

import java.util.ArrayList;

public class EmployeeOperation {

	ArrayList<Employee> emp_list;

	public EmployeeOperation() {
		emp_list = new ArrayList<>();
	}

	public void empAdd(Employee e) {
		emp_list.add(e);
	}

	public void removeEmp(Employee e) {
		emp_list.remove(e);
	}

	public boolean empExist(Employee e) {
		return emp_list.contains(e);
	}

	public ArrayList<Employee> empGet() {
		return emp_list;
	}

}
