package org.com;

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

// Application.java class should be in same or on top of all other packages 
@SpringBootApplication
//(scanBasePackages = "org.com")
//@ComponentScan({"org.com.dao","org.com.model","org.com.service"})
//@ComponentScan("org.com")
//@ComponentScan("org.com.model")
//@ComponentScan("org.com.service")
@EnableAutoConfiguration
@Configuration
//@EnableJpaRepositories(basePackages = {"org.com.service"})
//@EntityScan("org.com.model")
//@EntityScan("org.com.dao")

public class MainPrg {

	/*
	 * @Autowired //ItemService itemService; // ItemDao dao;
	 * 
	 * @Qualifier("itemDao") static ItemService itemService;
	 * 
	 * @Autowired // @Qualifier("itemDao") private ItemDao itemDao;
	 * 
	 * 
	 */

	public static void main(String[] args) {

		// ApplicationContext ctx = SpringApplication.run(MainPrg.class, args);

		/*
		 * ConfigurableApplicationContext context = new SpringApplicationBuilder(
		 * Application.class).headless(false).run(args);
		 */
		ConfigurableApplicationContext ctx = new SpringApplicationBuilder(MainPrg.class).headless(false).run(args);

		ItemService itemService = ctx.getBean("itemService", ItemService.class);
		ProductService productService  = ctx.getBean("productService", ProductService.class);

		Product product=new Product("book1");
		Item item=new Item("item1",5666,2,product);
		productService.addItem(product);
		itemService.addItem(item);
				
		itemService.getAllItem().forEach(System.out::println);

		System.out.println("working .............");

		SwingApp1 app1 = ctx.getBean(SwingApp1.class);
		app1.setVisible(true);
		itemService.getAllItem();
	}
}
