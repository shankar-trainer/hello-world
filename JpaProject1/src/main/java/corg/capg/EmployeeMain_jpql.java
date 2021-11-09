package corg.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import corg.capg.model.Employee;

public class EmployeeMain_jpql {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		TypedQuery<Employee> qr = manager.createQuery("select e from Employee e where e.salary>=25000.0f",
				Employee.class);
		Query qr1 = manager.createQuery("select count(e) from Employee e");

		System.out.println("total no of records is " + qr1.getSingleResult());

		System.out.println("all record");

		for (Employee e : qr.getResultList()) 
			System.out.println(e);

		System.out.println("parameterised query \n");

		qr = manager.createQuery("select e from Employee e where e.salary>=:salary1", Employee.class);
		qr.setParameter("salary1", new Float(18000.0f));
		qr.getResultList().forEach(System.out::println);

	}
}
