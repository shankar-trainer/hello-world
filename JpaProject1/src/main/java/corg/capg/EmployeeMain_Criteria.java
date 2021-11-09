package corg.capg;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import corg.capg.model.Employee;

public class EmployeeMain_Criteria {

	public static void main(String[] args) {
		EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
		EntityManager manager = managerFactory.createEntityManager();

		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();

		CriteriaQuery<Employee> createQuery = criteriaBuilder.createQuery(Employee.class);

		Root<Employee> from = createQuery.from(Employee.class);

		CriteriaQuery<Employee> select = createQuery.select(from);

		manager.createQuery(select).getResultList().forEach(System.out::println);

		System.out.println("criteria query like \n");
		CriteriaQuery<Employee> where = createQuery.select(from).where(criteriaBuilder.like(from.get("name"), "su%"));

		manager.createQuery(where).getResultList().forEach(System.out::println);

		System.out.println("criteria query between \n");
		CriteriaQuery<Employee> between = createQuery.select(from)
				.where(criteriaBuilder.between(from.get("salary"), 10000, 30000));

		manager.createQuery(between).getResultList().forEach(System.out::println);
	}
}
