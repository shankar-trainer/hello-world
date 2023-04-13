package org.abc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by shankar on 4/13/2023.
 */
@Data
@Component("scustomer")
public class SpecialCustomer extends Customer {

    @PostConstruct
    public void init(){
        this.setCustomerId(667769);
        this.setCustomerName("amrendra kumar");
        this.setCustomerLocation("noida");
    }

    public void getInfo() {
        System.out.println("Special Customer Data");
        System.out.println("\tId :"+getCustomerId());
        System.out.println("\tName :"+getCustomerName());
        System.out.println("\tLocation :"+getCustomerLocation());

    }
}
