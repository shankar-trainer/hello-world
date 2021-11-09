package corg.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import corg.capg.model.Employee;

public class EmployeeMain_namedParameter {

	public static void main(String[] args) {

		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		TypedQuery<Employee> qr = manager.createQuery("select e from Employee e where e.salary>=:salary1",
				Employee.class);
		qr.setParameter("salary1", new Float(18000.0f));
		
		qr.getResultList().forEach(System.out::println);

		System.out.println("named query\n ");
		Query createNamedQuery = manager.createNamedQuery("getAllEmp");
		for (Object e : createNamedQuery.getResultList()) {
			System.out.println((Employee) e);
		}
		System.out.println("named query1 \n");
		createNamedQuery = manager.createNamedQuery("getAllEmp1");
		for (Object e : createNamedQuery.getResultList()) {
			System.out.println((Employee) e);
		}
	}
}
