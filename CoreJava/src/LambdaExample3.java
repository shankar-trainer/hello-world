import java.util.Arrays;
import java.util.Comparator;

import edu.lpu.collection.bean.Employee;

public class LambdaExample3 {

	static void display(Employee emp[]) {
		for (Employee employee2 : emp) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + "  " + employee2.getSalary());
		}
	}
	
	public static void main(String[] args) {
		int id1[] = { 1009, 1004, 1001, 1002 };
		String nm[] = { "om parkash", "jai parkash", "amrit kumar", "ram partap" };
		float sal[] = { 20000, 16000, 45000, 17000 };

		Employee employee[] = new Employee[4];

		for (int i = 0; i < employee.length; i++) {
			employee[i] = new Employee();
			employee[i].setId(id1[i]);
			employee[i].setName(nm[i]);
			employee[i].setSalary(sal[i]);
		}

		Comparator<Employee> comparator_by_name1 =(o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		};  
		
		Comparator<Employee> comparator_by_salary =(o1,o2)->{
			return Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));
		};  
		
		Arrays.sort(employee,comparator_by_name1);

		System.out.println("employee sorted  by name \n");
        display(employee);
        
        Arrays.sort(employee,comparator_by_salary);
        System.out.println("employee sorted  by salary \n");
        display(employee);
        
	}
}
