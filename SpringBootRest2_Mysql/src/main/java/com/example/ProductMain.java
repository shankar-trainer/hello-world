package com.example;

import com.example.dao.ProductRepository;
import com.example.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class ProductMain //implements CommandLineRunner
{
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class,args);
    }

//    @Autowired
//    ProductRepository repository;
//
//    @Override
//    public void run(String... args) throws Exception {
//        Product product[]=new Product[5];
//        product[0]=new Product(10001,"pant",2000, LocalDate.now());
//        product[1]=new Product(10002,"shirt",1700, LocalDate.of(2022,11,20));
//        product[2]=new Product(10003,"chocalate",500, LocalDate.of(2022,12,25));
//        product[3]=new Product(10004,"pizza",800, LocalDate.of(2021,8,20));
//        product[4]=new Product(10005,"burger",560, LocalDate.of(2022,3,30));
//
//        for (Product p:product
//             ) {
//            repository.save(p);
//        }
//    }
}
