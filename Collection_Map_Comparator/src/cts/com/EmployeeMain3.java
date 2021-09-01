package cts.com;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeMain3 {

	public static void main(String[] args) {
		Employee employee[] = new Employee[3];
		employee[0] = new Employee(1002, "rajeev kumar", 12000);
		employee[1] = new Employee(1001, "deepak kumar", 15000);
		employee[2] = new Employee(1003, "anand kumar", 10000);

		//comparison by key not value
		Comparator<Employee> comparator = (o1, o2) -> {
			return new Integer((o1).getEmpId()).compareTo(new Integer((o2).getEmpId()));
		};

//		TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>(comparator);
		TreeMap<Employee, Integer> map = new TreeMap<Employee, Integer>((o1, o2) -> {
			return new Integer((o1).getEmpId()).compareTo(new Integer((o2).getEmpId()));
		});

		for (Employee employee2 : employee) {
			map.put(employee2, employee2.getEmpId());
		}
		System.out.println("sorted by id ");
		for (Employee e : map.keySet()) {
			System.out.println(e);
		}

		map = new TreeMap<Employee, Integer>((o1, o2) -> {
			return o1.getEmpName().compareTo(o2.getEmpName());
		});

		for (Employee employee2 : employee) {
			map.put(employee2, employee2.getEmpId());
		}
		System.out.println("\nsorted by name \n");
		for (Employee e : map.keySet()) {
			System.out.println(e);
		}
	}
}
