package org.com;

import org.capg.model.Employee;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeMain {

    public static void main(String[] args) {

        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("manager1");
        EntityManager manager = managerFactory.createEntityManager();

        Employee employee = new Employee();
        employee.setId(10005);
        employee.setName("hari kumar");
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(employee);
        transaction.commit();
        System.out.println("Record added ");
    }
}