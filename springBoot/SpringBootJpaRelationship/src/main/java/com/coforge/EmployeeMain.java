package com.coforge;

import com.coforge.dao.AddressRepository;
import com.coforge.dao.EmployeeRepository;
import com.coforge.model.Address;
import com.coforge.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeMain {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeMain.class,args);
    }

}
