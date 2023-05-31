package com.example.model;

import jakarta.annotation.PostConstruct;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
@Data
public class Employee {
    private int id;
    private String name;
    private float salary;

    @Autowired
    private Address address;

    @Autowired
    private Set<Car> carSet;

    @PostConstruct
    public void employeeInit() {
        this.id = 677676;
        this.name = "joerge fernades";
        this.salary = 900000;

        System.out.println("car set " + carSet.size());

        carSet.add(new Car(45454, "ferari", 780000));
        carSet.add(new Car(45455, "jaguar", 1080000));
        carSet.add(new Car(45456, "celario", 7000000));

        System.out.println("car set " + carSet.size());
        address.setAddr_id(1);
        address.setAddr_city("chennai");
        address.setAddr_location("thoraipakkam");
    }

}
