package com.coforge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.coforge.service.ProductServiceImpl;

@Configuration
@ComponentScan("com.coforge.dao")
public class ProductConfig {

	@Bean
	public ProductServiceImpl getProductService() {
		return new ProductServiceImpl();
	}
}
