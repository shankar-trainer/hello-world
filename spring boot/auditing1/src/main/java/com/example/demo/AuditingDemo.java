package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AuditingDemo implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200.00);
        productRepository.save(product);

        System.out.println("Created Product: " + product.getName());
        System.out.println("Created By: " + product.getCreatedBy());
        System.out.println("Created Date: " + product.getCreatedDate());

        product.setPrice(1150.00);
        productRepository.save(product);

        System.out.println("Updated Product: " + product.getName());
        System.out.println("Last Modified By: " + product.getLastModifiedBy());
        System.out.println("Last Modified Date: " + product.getLastModifiedDate());
    }



}