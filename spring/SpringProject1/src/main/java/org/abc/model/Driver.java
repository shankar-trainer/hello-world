package org.abc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Data
@Component
public class Driver {
    @PostConstruct
    public void init() {
        System.out.println("driver init called using @PostConstruct");
        this.driverId = 8;
        this.driverName = "mohan kumar";
        this.driverAge = 45;
        this.driverSalary = 35000;
    }

    private int driverId;
    private String driverName;
    private int driverAge;
    private float driverSalary;
}
