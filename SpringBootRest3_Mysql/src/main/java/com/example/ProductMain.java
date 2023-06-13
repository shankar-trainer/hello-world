package com.example;

import com.example.dao.OrderRepository;
import com.example.dao.ProductRepository;
import com.example.model.Order;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ProductMain implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class, args);
    }

    @Autowired
    ProductRepository repository;

    @Autowired
    OrderRepository repository1;

    @Override
    public void run(String... args) throws Exception {
        Product product[] = new Product[5];
        Order order[] = new Order[3];

        order[0]=new Order();
        order[0].setOrderName("pizza");
        order[0].setOrderLocation("delhi");

        order[1]=new Order();
        order[1].setOrderName("grocerry");
        order[1].setOrderLocation("chennai");

        order[2]=new Order();
        order[2].setOrderName("book");
        order[2].setOrderLocation("kolkotta");

        Set<Order> orderSet = new HashSet<Order>();
        for (Order order1 : order)
            orderSet.add(order1);


        product[0] = new Product(10001, "pant", 2000, LocalDate.now(), orderSet);
//        product[1]=new Product(10002,"shirt",1700, LocalDate.of(2022,11,20));
//        product[2]=new Product(10003,"chocalate",500, LocalDate.of(2022,12,25));
//        product[3]=new Product(10004,"pizza",800, LocalDate.of(2021,8,20));
//        product[4]=new Product(10005,"burger",560, LocalDate.of(2022,3,30));

        for (Order order1 : order)
             repository1.save(order1);

            //     for (Product p:product             ) {
        repository.save(product[0]);
        //}
    }
}
