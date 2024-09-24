package com.coforge;

import com.coforge.model.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.List;

public class CustomerMain {

    public static void main(String[] args) {
        Configuration configuration=new Configuration().configure();

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();

        Transaction transaction = session.getTransaction();
        Customer customer=new Customer();
        int id=10004;

        Customer customer3 = session.get(Customer.class, id);
        if(customer3==null) {
            customer.setId(id);
            customer.setName("amites kumar");
            customer.setSalary(15000);

            transaction.begin();
            session.save(customer);
            transaction.commit();
            System.out.println("Record added");
        }
        else
            System.out.println("Customer with id "+id+" is already present");
        Query<Customer> fromCustomer = session.createQuery("from Customer");

        List<Customer> list = fromCustomer.list();
        list.forEach(a-> System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getSalary()));

        Customer customer1 = session.get(Customer.class, 10001);

        System.out.println("search operation");
        if(customer1!=null) {
            System.out.println("found with id 10001 ");
            System.out.println(customer1);
        }
        System.out.println("remove operation");

        Customer customer2 = session.get(Customer.class, 10001);
        if(customer2==null)
            System.out.println("id not found ");
        else {
            System.out.println("customer with id 10001 is deleted");
            transaction.begin();
            session.delete(customer2);
            transaction.commit();
            System.out.println("deleted");
        }

        System.out.println("update operation");
        customer2 = session.get(Customer.class, 10001);
        if(customer2==null)
            System.out.println("id not found ");
        else{
            customer2.setName("sarvesh sharma");
            customer2.setSalary(78000);
            transaction.begin();
             session.update(customer2);
            transaction.commit();
            System.out.println("Record updated "+customer2);
        }
    }

}
