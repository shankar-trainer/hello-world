package org.example;

import org.example.model.Employee;

import javax.persistence.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("test1");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        EntityTransaction transaction = entityManager.getTransaction();

        Employee employee=new Employee();
        employee.setId(10003);
        employee.setName("arnold methew");
        employee.setSalary(50000);
        employee.setDoj(LocalDate.of(2022,12,12));

        transaction.begin();
         entityManager.persist(employee);
        transaction.commit();
        System.out.println("record added ");

        Query from_employee = entityManager.createQuery("from Employee");
        from_employee.getResultList().forEach(a->System.out.println(a));
    }
}