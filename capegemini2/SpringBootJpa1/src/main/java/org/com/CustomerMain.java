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

		customer1.setName("chandan kumar");
		customer2.setName("arvind kumar");
		customer3.setName("rajiv kumar");

		customer1.setLocation("delhi");
		customer2.setLocation("noida");
		customer3.setLocation("gurgaon");

		dao.addCustomer(customer1);
		dao.addCustomer(customer2);
		dao.addCustomer(customer3);

		dao.ShowAllCustomer().stream().forEach(System.out::println);
		
		Customer searchCustomer = dao.searchCustomer(customer2);
		
		if(searchCustomer!=null)
			System.out.println("customer Found \n"+searchCustomer);
		else
			System.out.println("customer not found");

		ctx.stop();

	}
}
