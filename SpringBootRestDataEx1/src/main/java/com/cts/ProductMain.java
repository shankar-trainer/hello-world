package com.cts;

import com.cts.dao.ProductRepository;
import com.cts.model.Product;
import com.cts.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 

public class ProductMain implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProductMain.class, args);
	}

	@Autowired
	ProductService service;

	@Override
	public void run(String... args) throws Exception {
		Product product1=new Product();
        product1.setName("java beginner");
        product1.setCost(500.0f);

		Product product2=new Product();
		product2.setName("java pro");
		product2.setCost(12000);

		service.addProduct(product1);
		service.addProduct(product2);
	}
}
