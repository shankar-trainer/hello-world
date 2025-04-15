package org.audintel.config;

import java.time.LocalDate;

import org.audintel.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.audintel.model"})
public class ProductConfiguration {

	@Bean(name ="prd1" )
	public Product getMyProduct() {
	  return new Product(435454l,"t shirt",567.0f,LocalDate.of(2021, 10, 20));
	}
	
}
