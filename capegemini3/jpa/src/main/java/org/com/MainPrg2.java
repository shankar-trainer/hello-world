package org.com;

import org.com.dao.ItemDao;
import org.com.dao.ProductDao;
import org.com.model.Item;
import org.com.model.Product;
import org.com.service.ItemService;
import org.com.service.ProductService;
import org.com.swing.SwingApp1;
//package org.com.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication

public class MainPrg2 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(MainPrg2.class).headless(false).run(args);

		ItemDao itemDao = ctx.getBean( ItemDao.class);
		ProductDao productDao  = ctx.getBean( ProductDao.class);

		Product product=new Product("book1");
		
		Item item=new Item("item1",5666,2,product);
		productDao.save(product);
		
		itemDao.save(item);
		
		
		itemDao.findAll().forEach(System.out::println);

	}
}
