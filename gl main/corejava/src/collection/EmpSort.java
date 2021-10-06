package collection;

import java.util.Arrays;

public class EmpSort {

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];

		int id[] = { 1001, 1008, 2009 };
		String name[] = { "suresh kumar", "mohan kumar", "mohan kumar" };
		float salary[] = { 12000.56f, 78787.78f, 67676.78f };

		for (int i = 0; i < salary.length; i++) {
			emp[i] = new Employee();
			emp[i].setId(id[i]);
			emp[i].setName(name[i]);
			emp[i].setSalary(salary[i]);
		}
		
		Arrays.sort(emp);
		
		for (Employee e : emp) {
			System.out.println(e.getId()+"  "+e.getName()+"  "+e.getSalary());
		}
		
	}
	
}
