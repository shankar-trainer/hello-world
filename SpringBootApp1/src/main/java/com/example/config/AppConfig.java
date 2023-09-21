package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.model.Product;

@Configuration
public class AppConfig {

	@Bean
	public Product getProduct() {
		Product product=new Product();
		product.setPrdId(989898);
		product.setPrdName("shoe");
		return product;
	}
	
}
