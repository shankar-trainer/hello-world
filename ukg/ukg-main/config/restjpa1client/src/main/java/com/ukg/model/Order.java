package com.ukg.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "customer_order")
public class Order {

    @Id
    @GeneratedValue
    private  long orderId;
    private String orderName;
    private String orderLOcation;
    //private LocalDate localDate;

    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Customer customer;

}
