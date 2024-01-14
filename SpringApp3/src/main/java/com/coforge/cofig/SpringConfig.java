package com.coforge.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.dao.ProductDao;
import com.coforge.model.User;
import com.coforge.service.ProductService;

@Configuration
public class SpringConfig {

	@Bean
	public User getUser() {
		// return new User();
		User user = new User();
		user.setUserId(5656567);
		user.setUserName("lalit kumar");
		user.setUserSalary(34000);
		return user;
	}
	
	@Bean
	public ProductDao  getProductDao() {
		return new ProductDao();
	}
	
	@Bean
	public ProductService  getProductService() {
		return new ProductService();
	}
	
	
	
}
