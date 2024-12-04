package com.example.model;


import jakarta.persistence.Embeddable;
import lombok.Data;

import java.time.LocalDate;

@Embeddable
@Data
public class Order {

    private int orderId;
    private  String  orderName;
    private  String  orderLocation;
    private LocalDate orderDate;
}
