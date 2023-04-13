package org.abc.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by shankar on 4/12/2023.
 */
@Data
//@Component // no Component name , it may create component with small case i.e. bus
@Component("mybus")
public class Bus {
    @PostConstruct
    public void init() {
        System.out.println("init called using @PostConstruct");
        this.busId = 878778;
        this.busName = "dtc";
        this.busRoute = "sahadra to anand vihar";
        this.busFare = 60;
    }


    @PreDestroy
    public void cleanup() {
        System.out.println("cleanup called using @PreDestroy");
        this.busId = 878778;

    }

    private int busId;
    private String busName;
    private String busRoute;
    private float busFare;

    @Autowired
    Driver driver;
}
