package corg.capg;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import corg.capg.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		Employee employee = new Employee();
		// employee.setId(10005);
		Scanner sc = new Scanner(System.in);
		EntityTransaction transaction = manager.getTransaction();

		System.out.println("Enter name"); // employee.setName("suresh kumar"); //
		employee.setSalary(28000); // employee.setLocation("patna");

		employee.setName(sc.nextLine());

		System.out.println("Enter Salary");
		employee.setSalary(sc.nextFloat());
		System.out.println("Enter Location");
		employee.setLocation(sc.next());
		transaction.begin();
		manager.persist(employee);
		transaction.commit();

		System.out.println("Record added ");

	//	Query createQuery = manager.createQuery("from Employee");
		Query createQuery = manager.createQuery("select e from Employee e");

		List<Employee> resultList = createQuery.getResultList();
		for (Employee employee2 : resultList) {
			System.out.println(employee2.getId() + "  " + employee2.getName() + "  " + employee2.getSalary() + "  "
					+ employee2.getLocation());
		}

		System.out.println("Enter id to search Employee");
		int id = sc.nextInt();

		Employee find = manager.find(Employee.class, id);
		if (find == null)
			System.out.println("No employee found with id " + id);
		else {
			System.out.println("Employee found");
			System.out.println(
					find.getId() + "   " + find.getName() + "  " + find.getSalary() + "  " + find.getLocation());
		}
		System.out.println("Enter id to delete  Employee");
		id = sc.nextInt();

		find = null;
		find = manager.find(Employee.class, id);
		if (find == null)
			System.out.println("No employee present  with id " + id);
		else {

			transaction.begin();
			manager.remove(find);
			transaction.commit();
			System.out.println("Employee deleted");
		}
		System.out.println("after delete all data are ");
		List<Employee> empList1 = createQuery.getResultList();
		empList1.stream().forEach(a -> System.out
				.println(a.getId() + "  " + a.getName() + "  " + a.getSalary() + "  " + a.getLocation()));

	}
}
