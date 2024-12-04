package com.example;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class ProductMain  implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ProductMain.class,args);
    }

    @Autowired
    ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Product product1=Product.builder().productName("book").productCost(1200).build();
        Product product2=Product.builder().productName("sweets").productCost(300).build();
        Product product3=Product.builder().productName("pant").productCost(1600).build();

        Product product[]=new Product[]{product1,product2,product3};
        productRepository.saveAll(Arrays.asList(product));
    }
}
