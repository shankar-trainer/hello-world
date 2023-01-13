package org.audintel.main;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.audintel.model.Customer;

public class CustomerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("test1");

		EntityManager em = entityManagerFactory.createEntityManager();

		EntityTransaction transaction = em.getTransaction();

		System.out.println("Enter Id name salary");
		customer.setCustomerId(sc.nextInt());
		sc.nextLine();
		customer.setCustomerName(sc.nextLine());
		customer.setCustomerSalary(sc.nextFloat());

		transaction.begin();
		em.persist(customer);
		transaction.commit();
		System.out.println("Record Added");

		Query qr = em.createQuery("from  Customer ");

		System.out.println("All Records are ");
		List<Customer> resultList = qr.getResultList();

		for (Customer customer2 : resultList) {
			System.out.println(customer2.getCustomerId() + "\t" + customer2.getCustomerName() + "\t"
					+ customer2.getCustomerSalary());
		}

		System.out.println("enter id to find record ");
		Customer customer3 = em.find(Customer.class, sc.nextInt());
		if (customer3 == null)
			System.out.println("customer not found ");
		else {
			System.out.println("found ");
			System.out.println(customer3.getCustomerId() + "\t" + customer3.getCustomerName() + "\t"
					+ customer3.getCustomerSalary());
		}

		System.out.println("enter id to delete  record ");
		Customer customer4 = em.find(Customer.class, sc.nextInt());
		if (customer4 != null) {
			transaction.begin();

			em.remove(customer4);
			transaction.commit();
			System.out.println("Record deleted ");
		} else
			System.out.println("Record not found");

		sc.close();
		entityManagerFactory.close();
		em.close();
	}
}
