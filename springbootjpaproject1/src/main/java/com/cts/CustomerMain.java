package com.cts;

import com.cts.dao.CustomerRepository;
import com.cts.model.Customer;
import com.cts.service.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class CustomerMain {
    public static void main(String[] args) {
        SpringApplication.run(CustomerMain.class, args);
//        ConfigurableApplicationContext ctx = SpringApplication.run(CustomerMain.class, args);
//
//        CustomerService service = ctx.getBean(CustomerService.class);
//
//        Customer customer1=new Customer();
//
//        customer1.setId(10002);
//        customer1.setName("parvin kumar");
//        customer1.setSalary(19000.0f);
//
//        Customer customer = service.addCustomer(customer1);
//        System.out.println("Record added "+customer);
//
//        service.getAll().forEach(System.out::println);

    }
}
