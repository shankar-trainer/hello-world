package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import com.example.model.Bus;
import com.example.model.ManagerInfo;
import com.example.model.Order;
import com.example.model.Phone;
import com.example.model.Product;

@Configuration
@ComponentScan(value = "com.example.model")
public class JavaConfiguration {
	@Bean
	@Scope(scopeName = "prototype")
	public Product getProduct() {
		Product prd1 = new Product(1002, "jeans pant", 2400, getOrder());
		return prd1;
	}

	@Bean
	public Order getOrder() {
		return new Order();
	}

	@Bean
	@Lazy(value = true)
	public Phone getPhone() {
		System.out.println("getPhone() called  ");
		return new Phone();
	}

	@Bean
	public ManagerInfo getManagerInfo() {
		 return new ManagerInfo();
	}
	
	@Bean
	public Bus getBusInfo() {
		return new Bus();
	}
}
