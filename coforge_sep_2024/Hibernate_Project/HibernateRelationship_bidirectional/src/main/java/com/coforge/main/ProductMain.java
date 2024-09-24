package com.coforge.main;

import com.coforge.model.Order;
import com.coforge.model.Product;
import com.coforge.util.HibernateSessionFactory;
import lombok.Builder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductMain {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateSessionFactory.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.getTransaction();
        Product product[] = new Product[2];

        product[0] = Product.builder().prdCost(100).prdName("biscuit").build();
        product[1] = Product.builder().prdCost(1200).prdName("shirt").build();

        Order order[] = new Order[3];
        order[0] = Order.builder().orderName("Biscuit Order1").orderLocation("gr noida").build();
        order[1] = Order.builder().orderName("Biscuit Order2").orderLocation("faridabad").build();
        order[2] = Order.builder().orderName("Biscuit Order3").orderLocation("gurgaon").build();

        Order order1[] = new Order[3];
        order1[0] = Order.builder().orderName("Shirt Order1").orderLocation("mathura").build();
        order1[1] = Order.builder().orderName("Shirt Order2").orderLocation("lucknow").build();
        order1[2] = Order.builder().orderName("Shirt Order3").orderLocation("aagra").build();

        Set<Order> orderSet1= Stream.of(order).collect(Collectors.toSet());
        Set<Order> orderSet2= Stream.of(order1).collect(Collectors.toSet());

//        Set<Order> orderSet1 = new HashSet<>();
//        Set<Order> orderSet2 = new HashSet<>();
//
//        for (Order o1 : order)
//            orderSet1.add(o1);
//
//        for (Order o1 : order1)
//            orderSet2.add(o1);

        product[0].setOrderSet(orderSet1);
        product[1].setOrderSet(orderSet2);

        for(Product p:product) {
            transaction.begin();
             session.save(p);
            transaction.commit();
        }

        session.createQuery("from Product").list().forEach(System.out::println);


    }
}
