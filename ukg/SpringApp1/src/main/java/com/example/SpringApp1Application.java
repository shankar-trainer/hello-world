//package com.example.SpringApp1;
package com.example;

import com.example.config.AppConfig;
import com.example.model.Address;
import com.example.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
//(scanBasePackages = "com.example.config")
//@SpringBootApplication=@EnableAutoConfiguration+@ComponentScan+@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan(basePackages = {"com.example.config"})
//@SpringBootConfiguration
public class SpringApp1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SpringApp1Application.class, args);
         AppConfig config=  ctx.getBean(AppConfig.class);
		 Employee emp= config.getEmployee();
		 Employee emp1= config.getEmployee();

		 System.out.println(emp.equals(emp1));

		 emp1.setId(7878787);
		 emp1.setName("surendra kumar");
		 emp1.setSalary(340000);

		Address address=emp.getAddress();

		//System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary());
		System.out.println(emp);
		System.out.println("\nemployee address ");
		System.out.println(address);
		//System.out.println(address.getAddrId()+"\t"+address.getLocation()+"\t"+address.getCity());

		System.out.println(emp1);
		//System.out.println(emp1.getId()+"\t"+emp1.getName()+"\t"+emp1.getSalary());
		ctx.close();
	}

}
