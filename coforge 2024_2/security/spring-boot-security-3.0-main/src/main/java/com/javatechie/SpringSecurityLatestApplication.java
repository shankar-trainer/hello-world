package com.javatechie;

import com.javatechie.controller.ProductController;
import com.javatechie.entity.UserInfo;
import org.hibernate.dialect.MySQLDialect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityLatestApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLatestApplication.class, args);
	}

	@Autowired
	ProductController productController;

	@Override
	public void run(String... args) throws Exception {
		productController.addNewUser(UserInfo.builder().name("amit").email("sumit@gmail.com").password("abcd").roles("ROLE_ADMIN").build());
		productController.addNewUser(UserInfo.builder().name("sumit").email("amit@gmail.com").password("abcd").roles("ROLE_USER").build());
		//productController.getAllTheProducts().forEach(System.out::println);
	}
}
/*
POSTMAN
localhost:8080/products/new
post METHOD
{ "name":"mohan",
  "email":"mohan@gmail.com",
  "password":"mohan",
   "roles":"ROLE_ADMIN"
}
{ "name":"sohan",
  "email":"sohan@gmail.com",
  "password":"sohan",
   "roles":"ROLE_USER"
}


http://localhost:8080/products/all

 */
