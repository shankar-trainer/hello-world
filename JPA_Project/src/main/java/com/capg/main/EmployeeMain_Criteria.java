package com.capg.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Root;

import com.capg.bean.Employee;

public class EmployeeMain_Criteria {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sample");
		EntityManager em = emf.createEntityManager();

		CriteriaBuilder builder = em.getCriteriaBuilder();

		CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);

		Root<Employee> from = criteriaQuery.from(Employee.class);

		CriteriaQuery<Employee> select = criteriaQuery.select(from);

		TypedQuery<Employee> createQuery = em.createQuery(select);
		List<Employee> resultList = createQuery.getResultList();
		resultList.forEach(
				a -> System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getLocation() + "\t" + a.getName()));

		CriteriaQuery<Employee> where1 = criteriaQuery.select(from).where(builder.like(from.get("name"), "%i"));

		System.out.println("using where and like \n");
		em.createQuery(where1).getResultList().forEach(
				a -> System.out.println(a.getId() + "\t" + a.getName() + "\t" + a.getLocation() + "\t" + a.getName()));

		CriteriaQuery<Employee> between = criteriaQuery.select(from)
				.where(builder.between(from.get("salary"), 60000, 90000));

		System.out.println("\nusing between  \n");
		em.createQuery(between).getResultList().forEach(a -> System.out.println(
				a.getId() + "\t" + a.getName() + "\t" + a.getLocation() + "\t" + a.getName() + "\t" + a.getSalary()));

	}
}
