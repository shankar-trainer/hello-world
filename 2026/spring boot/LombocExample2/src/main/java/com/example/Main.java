package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.ApplicationConfig;
import com.example.service.BookService;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		var service=context.getBean(BookService.class);
		
		service.setBookdata();
		System.out.println(service.getBook());
	}
}
