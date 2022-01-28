import java.util.Comparator;
import java.util.stream.Stream;

import edu.lpu.collection.bean.Employee;

public class StreamEmployeeMain {

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

		Stream.of(employee).forEach(k -> System.out.println(k.getId() + "  " + k.getName() + "  " + k.getSalary()));

		System.out.println("\nsort by name and display it\n");

		Comparator<Employee> comparator_by_name1 = (o1, o2) -> {
			return o1.getName().compareTo(o2.getName());
		};

		Stream.of(employee).sorted(comparator_by_name1)
				.forEach(k -> System.out.println(k.getId() + "  " + k.getName() + "  " + k.getSalary()));

		System.out.println("\nsort by salary and display it\n");
		
	
		Stream.of(employee).sorted((o1,o2)->{
			return Float.valueOf(o1.getSalary()).compareTo(Float.valueOf(o2.getSalary()));
		})
		.forEach(k -> System.out.println(k.getId() + "  " + k.getName() + "  " + k.getSalary()));
		
	}
}
