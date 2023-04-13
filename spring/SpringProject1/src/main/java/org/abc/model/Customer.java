package org.abc.model;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Created by shankar on 4/13/2023.
 */
@Data
@Component
public abstract class Customer {

    private int customerId;
    private String customerName;
    private String customerLocation;
    public abstract void getInfo();
}
