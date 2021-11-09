package corg.capg;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.capg.model.onetomany_bi.Department;
import org.capg.model.onetomany_bi.Employee1;

public class DepartmentMain {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		EntityTransaction transaction = manager.getTransaction();

		Employee1 employee1 = new Employee1();
		Employee1 employee2 = new Employee1();
		Employee1 employee3 = new Employee1();

		employee1.setName("arvind kumar");
		employee2.setName("krithika p");
		employee3.setName("gopi shivaji");

		Set<Employee1> set1 = new HashSet<>();
		set1.add(employee1);
		set1.add(employee2);
		set1.add(employee3);

		Department department = new Department();
		department.setDeptName("development");
		department.setEmployee(set1);

		employee1.setDepartment(department);
		employee2.setDepartment(department);
		employee3.setDepartment(department);

		transaction.begin();

		manager.persist(department);
		manager.persist(employee1);
		manager.persist(employee2);
		manager.persist(employee3);

		transaction.commit();
		manager.close();
		managerFactory.close();

	}
}
