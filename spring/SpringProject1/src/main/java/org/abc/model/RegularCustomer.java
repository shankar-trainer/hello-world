package org.abc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by shankar on 4/13/2023.
 */
@Data
@Component("rcustomer")
public class RegularCustomer extends Customer {

    @PostConstruct
    public void init(){
        this.setCustomerId(667767);
        this.setCustomerName("surendra kumar");
        this.setCustomerLocation("new delhi");
    }

    public void getInfo() {
        System.out.println("Regular Customer Data");
        System.out.println("\tId :"+getCustomerId());
        System.out.println("\tName :"+getCustomerName());
        System.out.println("\tLocation :"+getCustomerLocation());

    }
}
