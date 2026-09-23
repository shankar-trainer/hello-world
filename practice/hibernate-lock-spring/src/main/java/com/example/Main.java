package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Employee;


public class Main {
    public static void main(String[] args) {
        
        // 1. Create the SessionFactory from hibernate.cfg.xml
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        // 2. Open a session
        Session session = factory.openSession();

        // 3. Begin a transaction
        Transaction transaction = session.beginTransaction();

        try {
            // 4. Create and save transient entity objects
            Employee emp1 = new Employee(101, "Alice");
            Employee emp2 = new Employee(102, "Bob");

            session.persist(emp1);
            session.persist(emp2);
//            session.persist(emp2);

            // 5. Commit the transaction
            transaction.commit();
            System.out.println("Employees successfully saved!");

        } catch (Exception e) {
            if (transaction != null) transaction.rollback();
            e.printStackTrace();
        } finally {
            // 6. Clean up resources
            session.close();
            factory.close();
        }
    }
}
//mvn compile exec:java
