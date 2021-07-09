package cts.collection.dao;

public class EmployeeMain {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();

		Employee employee[] = new Employee[3];

		employee[0] = new Employee(10003, "pankaj kumar", 12000);
		employee[1] = new Employee(10001, "amit kumar", 11000);
		employee[2] = new Employee(10002, "ramesh kumar", 8000);
		for (Employee employee2 : employee) {
			dao.addEmployee(employee2);
		}

		Employee searchEmployee = dao.searchEmployee(employee[1]);
		if (searchEmployee != null) {
			System.out.println("search found ");
			System.out.println(searchEmployee.getEmpId() + " " + searchEmployee.getEmpName() + " "
					+ searchEmployee.getEmpsalary());
		} else
			System.out.println("not present");

		System.out.println("\nAll Records ");
		System.out.println("id\tname\tsalary");
		
		dao.removeEmployee(employee[1]);
		
		for (Employee employee2 : dao.getAllEmployee()) {
			System.out.println(employee2.getEmpId() + "\t" + employee2.getEmpName() + "\t" + employee2.getEmpsalary());
		}
	}
}
