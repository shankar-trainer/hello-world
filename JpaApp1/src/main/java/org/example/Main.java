package org.example;

import org.example.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("test1");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        Employee employee=new Employee();
        employee.setId(10001);
        employee.setName("john clark");
        employee.setSalary(20000);

        transaction.begin();
         entityManager.persist(employee);
        transaction.commit();

    }
}