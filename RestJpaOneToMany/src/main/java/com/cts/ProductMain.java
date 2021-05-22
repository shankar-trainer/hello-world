package com.cts;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cts.dao.OrderRepository;
import com.cts.dao.ProductRepository;
import com.cts.model.Order;
import com.cts.model.Product;

@SpringBootApplication
public class ProductMain  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProductMain.class, args);
	}
	
	@Autowired
	ProductRepository prd_repository;
	
	@Autowired
	OrderRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
	
		Order order=new Order();
	    order.setOrderName("book order");
	    order.setOrderLocation("chennai");
	    order.setOrderCost(7899);
	    
	    Product product1=new Product();
	    Product product2=new Product();
	    Product product3=new Product();
	  
	    product1.setPrdName("java in action");
	    product1.setPrdCount(4);
	    product1.setPrdCost(1200);
	    product1.setPrdTotalCost(product1.getPrdCost()*product1.getPrdCount());

	    product2.setPrdName("pro java 8");
	    product2.setPrdCount(3);
	    product2.setPrdCost(1600);
	    product2.setPrdTotalCost(product2.getPrdCost()*product2.getPrdCount());
	    
	    product3.setPrdName("java complete reference ");
	    product3.setPrdCount(6);
	    product3.setPrdCost(100);
	    product3.setPrdTotalCost(product3.getPrdCost()*product3.getPrdCount());
	    
	    Set<Product> set1=new HashSet<Product>();
	    set1.add(product1);
	    set1.add(product2);
	    set1.add(product3);
	    
	    for(Product p:set1) {
	    	prd_repository.save(p);
	    }
	    order.setPrdSet(set1);
	    repository.save(order);
	}
}
