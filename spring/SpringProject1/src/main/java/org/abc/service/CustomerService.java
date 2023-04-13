package org.abc.service;

import lombok.Data;
import org.abc.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by shankar on 4/13/2023.
 */
@Data
@Component
public class CustomerService {

    @Autowired
    @Qualifier("rcustomer")
    Customer customer;
}
