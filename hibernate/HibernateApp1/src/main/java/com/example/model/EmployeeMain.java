package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;
import java.util.Scanner;

/**
 * Created by shankar on 3/30/2023.
 */
public class EmployeeMain {

    public static void main(String[] args) {

        Configuration configuration = new Configuration();
        configuration.configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Scanner sc=new Scanner(System.in);

        //System.out.println("Enter employee id name  salary and location");
        System.out.println("Enter employee  name  salary and location");
        Employee emp1 = new Employee();
        //emp1.setEmpId(sc.nextInt());
          //sc.nextLine();
        emp1.setEmpName(sc.nextLine());
        emp1.setEmpSalary(sc.nextFloat());
        emp1.setLocation(sc.next());


        Transaction transaction = session.getTransaction();

        transaction.begin();
        session.save(emp1);

        System.out.println("add record in database");
        if(sc.next().equalsIgnoreCase("y")) {
            transaction.commit();
            System.out.println("Record added");
        }
        else {
            transaction.rollback();
            System.out.println("Record not added ");
        }
                                                     //hql hibernate query language
        List<Employee> list = session.createQuery("from Employee").list();
        System.out.println("Records are");
        for (Employee emp:list) {
            System.out.println(emp.getEmpId()+"\t"+emp.getEmpName()+"\t"+emp.getEmpSalary()+"\t"+emp.getLocation());
        }

    }
}
