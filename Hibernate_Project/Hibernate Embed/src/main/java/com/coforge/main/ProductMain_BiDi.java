package com.coforge.main;

import com.coforge.model.Order;
import com.coforge.model.Product;
import com.coforge.util.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
// Bidirectional
public class ProductMain_BiDi {
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

        Set<Product> collect = Stream.of(product).collect(Collectors.toSet());

        for (Order o:order)
            o.setProductSet(collect);

        for (Order o:order1)
            o.setProductSet(collect);

        for(Order o:order) {
            transaction.begin();
             session.save(o);
            transaction.commit();
        }
        for(Order o:order1) {
            transaction.begin();
             session.save(o);
            transaction.commit();
        }

        session.createQuery("from Order").list().forEach(System.out::println);
    }
}
