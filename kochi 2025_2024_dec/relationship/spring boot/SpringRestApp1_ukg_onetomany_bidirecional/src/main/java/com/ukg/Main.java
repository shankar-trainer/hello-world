package com.ukg;

import com.ukg.model.Customer;
import com.ukg.model.Product;
import com.ukg.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.stream.Collectors;

@SpringBootApplication
public class Main // implements CommandLineRunner
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main.class, args);
    }
/*
    @Autowired
    ProductRepository productRepository2;

    @Transactional
    @Override
    public void run(String... args) throws Exception {
        Customer c = new Customer();
        //c.setId(1001);
        c.setName("ram kumar");
        c.setSsn("abc1234");

        Product p1 = new Product();
        //p1.setId(1);
        p1.setCost(100);
        p1.setPname("biscuit");

        Product p2 = new Product();
        //p2.setId(2);
        p2.setCost(200);
        p2.setPname("chocalate");

        p1.setCustomer(c);
        p2.setCustomer(c);
        productRepository2.save(p1);
        productRepository2.save(p2);
    }*/


    //productRepository2.saveAll(Arrays.stream(p).toList());
   //c.setProductSet(Arrays.stream(p).Collectors.toSet());

}

