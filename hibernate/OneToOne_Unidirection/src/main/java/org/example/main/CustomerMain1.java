package org.example.main;

import org.example.model.Car;
import org.example.model.Customer;
import org.example.model.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shankar on 4/5/2023.
 */
public class CustomerMain1 {
    public static void main(String[] args) {


        Configuration configure = new Configuration().configure();
        SessionFactory sessionFactory = configure.buildSessionFactory();

        Session session = sessionFactory.openSession();

        Transaction transaction = session.getTransaction();


        Customer customer = new Customer();
        Order order = new Order();

        Set<Car> mycarSet = new HashSet<Car>();


        customer.setCustomerName("sumit kumar");
        customer.setCustomersalary(450000);

        order.setOrderName("biscuit order");
        order.setOrderCost(15000);

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setCarModel("maruti");
        car1.setCarCost(500000);

        car2.setCarModel("tata jaguar");
        car2.setCarCost(1200000);

        car3.setCarModel("bmw");
        car3.setCarCost(2000000);

        mycarSet.add(car1);
        mycarSet.add(car2);
        mycarSet.add(car3);

        customer.setOrder(order);
        customer.setCarSet(mycarSet);
// due to cascade operation no need to save dependent objects
        /*
        transaction.begin();
        session.save(order);
        transaction.commit();

        for (Car c : mycarSet ) {
            transaction.begin();
            session.save(c);
            transaction.commit();
        }
*/
        transaction.begin();
        session.save(customer);
        transaction.commit();


    }
}
