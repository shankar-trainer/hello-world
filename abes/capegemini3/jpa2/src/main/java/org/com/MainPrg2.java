package org.com;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MainPrg2 {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx =SpringApplication.run(MainPrg2.class, args);

	/*	ItemDao itemDao = ctx.getBean( ItemDao.class);
		ProductDao productDao  = ctx.getBean( ProductDao.class);

		Product product1=new Product();
		Product product2=new Product();
		
		product1.setPrd_name("book");
		product2.setPrd_name("trouser");
		
		Set<Product> set1=new HashSet<>();
		set1.add(product1);
		
		set1.add(product2);

		productDao.save(product1);
		productDao.save(product2);
		
		Item item=new Item();
		
		item.setItem_cost(789);
		item.setItem_name("item1");
		item.setItem_qty(2);
	
		item.setProduct_set(set1);
		
		itemDao.save(item);
		
		itemDao.findAll().forEach(System.out::println);*/
	}
	   @Bean
	   public Docket productApi() {
	      return new Docket(DocumentationType.SWAGGER_2).select()
	         .apis(RequestHandlerSelectors.basePackage("")).build();
	   }

}
