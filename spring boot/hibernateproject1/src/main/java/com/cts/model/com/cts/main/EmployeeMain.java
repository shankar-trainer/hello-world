package com.cts.model.com.cts.main;

import com.cts.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.time.LocalDate;
import java.util.List;

public class EmployeeMain {

    public static void main(String[] args) {
        Configuration configuration=new Configuration();
        configuration.configure();

        SessionFactory sessionFactory= configuration.buildSessionFactory();

        Session session= sessionFactory.openSession();

        Transaction transaction = session.getTransaction();

        transaction.begin();
        Employee employee=new Employee();
//        employee.setId(1006);
        employee.setName("amit sharma");
        employee.setSalary(45000);
        employee.setDob(LocalDate.of(2001,11,11));
        session.save(employee);
        transaction.commit();
        System.out.println("data added");

        //HQL -- hibernate query language
        Query fromEmployee = session.createQuery("from Employee");

        List< Employee> list =fromEmployee.list();

//        list.forEach(a-> System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));
        list.forEach(a-> System.out.println(a));
//        session.find()
       // session.delete();

        Employee employee1 = session.find(Employee.class, 1001);
        if(employee1!=null)
            System.out.println("found  width id 1001  "+employee1);

    }
}

