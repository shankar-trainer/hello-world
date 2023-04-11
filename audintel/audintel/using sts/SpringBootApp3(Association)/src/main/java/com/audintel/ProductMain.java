package com.audintel;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.audintel.dao.ManufacturingCompanyRepository;
import com.audintel.dao.ProductOrderRepository;
import com.audintel.dao.ProductRepository;
import com.audintel.model.ManufacturingCompany;
import com.audintel.model.Product;
import com.audintel.model.ProductOrder;

@SpringBootApplication
public class ProductMain //implements CommandLineRunner 
{

	public static void main(String[] args) {
		SpringApplication.run(ProductMain.class, args);  
		
	}

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductOrderRepository productOrderRepository;

	@Autowired
 	ManufacturingCompanyRepository manufacturingCompanyRepository;

	@Override
	public void run(String... args) throws Exception {

		Product product = new Product();
		product.setPrdName("cough syrup");
		product.setPrdCost(100);

		ManufacturingCompany company = new ManufacturingCompany();

		company.setCompanyLocation("hyderbad");
		company.setCompanyName("aimil");
		company.setCompanyState("telengana");

		Set<ProductOrder> orderSet = new HashSet<>();

		ProductOrder order1 = new ProductOrder();
		ProductOrder order2 = new ProductOrder();
		ProductOrder order3 = new ProductOrder();

		order1.setNoOfOrder(5);
		order1.setOrderDate(LocalDate.of(2022, 10, 10));
		order1.setTotalCost(order1.getNoOfOrder() * product.getPrdCost());

		order2.setNoOfOrder(6);
		order2.setOrderDate(LocalDate.of(2022, 11, 15));
		order2.setTotalCost(order1.getNoOfOrder() * product.getPrdCost());

		order3.setNoOfOrder(50);
		order3.setOrderDate(LocalDate.of(2022, 1, 22));
		order3.setTotalCost(order1.getNoOfOrder() * product.getPrdCost());

		orderSet.add(order1);
		orderSet.add(order2);
		orderSet.add(order3);

		product.setPrdOrderSet(orderSet);
		product.setCompany(company);

		manufacturingCompanyRepository.save(company);

		for (ProductOrder order : orderSet)
			productOrderRepository.save(order);
		
		productRepository.save(product);
	}
	
}
