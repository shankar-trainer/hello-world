package com.example;

import com.example.model.Address;
import com.example.model.Car;
import com.example.model.Employee;
import com.example.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Set;

@SpringBootApplication()

public class EmployeeMain {
// gradle bootRun
    public static void main(String[] args) {
        ConfigurableApplicationContext bean = SpringApplication.run(EmployeeMain.class, args);
        Employee employee = bean.getBean(Employee.class);
        System.out.println(employee);

        System.out.println("Employee data ");
        System.out.println("\tid "+employee.getId());
        System.out.println("\tname "+employee.getName());
        System.out.println("\tsalary "+employee.getSalary());

        System.out.println("\n Address");
        Address address = employee.getAddress();
        System.out.println("\tid "+address.getAddr_id());
        System.out.println("\tcity "+address.getAddr_city());
        System.out.println("\tlocation "+address.getAddr_location());

        Set<Car> carSet = employee.getCarSet();
        System.out.println("\nCar data ");
        for (Car c:carSet  ) {
            System.out.println("\n\tRegistration No "+c.getRegNo());
            System.out.println("\tModel "+c.getModel());
            System.out.println("\tCost "+c.getCost());
        }
    }
}
