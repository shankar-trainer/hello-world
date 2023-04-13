package org.example.main;

import org.example.model.Customer;
import org.example.model.Order;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.List;

/**
 * Created by shankar on 4/4/2023.
 */
public class CustomerMain {

    public static void main(String[] args) {

        Session session = new Configuration().configure().buildSessionFactory().openSession();

        Customer customer = new Customer();
        customer.setCustomerName("parvin kumar");
        customer.setCustomersalary(34000);

        Order order = new Order();
        order.setOrderName("biryani order");
        order.setOrderCost(800);

        customer.setOrder(order);


        Transaction tr = session.getTransaction();
// due to cascade operation no need to save dependent object
        /*
        tr.begin();
        session.save(order);
        tr.commit();
*/

        tr.begin();
        session.save(customer);
        tr.commit();

        System.out.println("added successfully");

        List<Customer> list = session.createQuery("from Customer").list();

        for (Customer c : list) {
            System.out.println("Customer values ");
           // System.out.println("\t" + c);
            System.out.println("\t"+c.getCustomerId()+"\t"+c.getCustomerName()+"\t"+c.getCustomersalary());
            System.out.println("Customer Order  values ");

            //System.out.println("\t" + c.getOrder());
            Order order1 = c.getOrder();
            System.out.println("\t" +order1.getOrderId()+"\t"+order1.getOrderName()+"\t"+order1.getOrderCost() );


            //cascade delete  no need to delete order


            Session session1 = new Configuration().configure().buildSessionFactory().openSession();

            Transaction tr1 = session.getTransaction();

            Customer customer1=new Customer();
            customer1.setCustomerId(1);
            tr1.begin();
            session1.delete(customer1);
     tr1.commit();

        }

    }
}
