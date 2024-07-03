package com.coforge;
import com.coforge.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@EnableDiscoveryClient
public class EmployeeClientMain {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeClientMain.class,args);
        RestTemplate restTemplate=new RestTemplate();
        Employee forObject = restTemplate.getForObject("http://localhost:9090/allEmployee/1", Employee.class);

        System.out.println(forObject);
    }
}
