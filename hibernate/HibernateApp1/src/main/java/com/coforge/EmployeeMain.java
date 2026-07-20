package com.coforge;

import com.coforge.model.Employee;
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

        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.getTransaction();

        Employee employee1=new Employee();
//        employee1.setId(1004);
        employee1.setName("amitesh kumar");
        employee1.setDob(LocalDate.of(1998, 11, 23));

        transaction.begin();
        session.persist(employee1);
        transaction.commit();
        System.out.println("record added");

        Query<Employee> query = session.createQuery("from Employee");
        
        List<Employee> list = query.list();
        
//        list.stream().forEach(a->System.out.println(a));
        list.stream().forEach(a->System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getDob()));

        
    }
}
