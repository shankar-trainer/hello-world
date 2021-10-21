package org.com;

import org.com.dao.CustomerDao;
import org.com.model.Customer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CustomerMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx = SpringApplication.run(CustomerMain.class, args);
		CustomerDao dao = ctx.getBean(CustomerDao.class);
		
		Customer customer1 = new Customer();
		Customer customer2 = new Customer();
		Customer customer3 = new Customer();
		
		customer1.setName("Annie Douglas");
		customer2.setName("Harish Bardman");
		customer3.setName("Stacy Almond");
	
	    customer1.setLocation("Sydney");
		customer2.setLocation("NYC");
		customer3.setLocation("North Carolina");
		
	 
		dao.showCustomer().stream().forEach(System.out::println);
   
	    Customer searchCustomer = dao.searchCustomer(customer2);
	    
	    if(searchCustomer!=null)
	    	System.out.println("Customer found");
	    else
	    	System.out.println("Customer not found");
	    
	    ctx.stop();
	}
}
