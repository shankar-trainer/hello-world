package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import com.example.model.Book;
@SpringBootApplication
public class SpringBootApp2Application {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootApp2Application.class, args);
		ConfigurableApplicationContext bean  = SpringApplication.run(SpringBootApp2Application.class, args);
		//Book bean1 = bean.getBean(Book.class);
		//Book bean1 = bean.getBean("book",Book.class);// book is default instance
		Book bean1 = bean.getBean("mybook",Book.class);
		Book bean2 = bean.getBean("mybook",Book.class);

		bean2.setBname("spring rest book");
		bean2.setCost(2500);
		bean2.setIsbn(9000);

		System.out.println("bean1 values ");
		System.out.println("isbn:"+bean1.getIsbn());
		System.out.println("name:"+bean1.getBname());
		System.out.println("cost:"+bean1.getCost());

		System.out.println("\nbean2 values ");
		System.out.println("isbn:"+bean2.getIsbn());
		System.out.println("name:"+bean2.getBname());
		System.out.println("cost:"+bean2.getCost());
		//bean.close();
	}

}
