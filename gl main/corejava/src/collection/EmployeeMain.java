package collection;

import java.util.ArrayList;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];

		int id[] = { 1001, 1008, 2009 };
		String name[] = { "suresh kumar", "mohan kumar", "mohan kumar" };
		float salary[] = { 12000.56f, 78787.78f, 67676.78f };

		EmployeeOperation operation = new EmployeeOperation();

		for (int i = 0; i < salary.length; i++) {
			emp[i] = new Employee();
			emp[i].setId(id[i]);
			emp[i].setName(name[i]);
			emp[i].setSalary(salary[i]);

			operation.empAdd(emp[i]);
		}
		System.out.println("Employee Records are ");

		ArrayList<Employee> elist = operation.empGet();
operation.removeEmp(emp[2]);
		
System.out.println
("Employee2 is present "+operation.empExist(emp[1]));
		
		for (Employee emp1 : elist) {
			System.out.println("\n\tId " + emp1.getId());
			System.out.println("\tName " + emp1.getName());
			System.out.println("\tSalary " + emp1.getSalary());
		}

	}
}
