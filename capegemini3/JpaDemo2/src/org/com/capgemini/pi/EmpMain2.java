package org.com.capgemini.pi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.com.capgemini.model.Employee;

public class EmpMain2 {

	public static void main(String[] args) {

		EntityManagerFactory ef = Persistence.createEntityManagerFactory("jpaDemo2");
		EntityManager em = ef.createEntityManager();
		EntityTransaction tr = em.getTransaction();

		CriteriaBuilder builder = em.getCriteriaBuilder();

		CriteriaQuery<Employee> cqr1 = builder.createQuery(Employee.class);
		Root<Employee> emp = cqr1.from(Employee.class);

		CriteriaQuery<Employee> select = cqr1.select(emp);

		Query q = em.createQuery(select);

		List<Employee> resultList = q.getResultList();

		for (Employee employee : resultList) {
			System.out.println(employee);
		}

		ef.close();
	}
}

