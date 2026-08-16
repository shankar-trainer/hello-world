package com.coforge.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "order1")
public class Order {

    @Id
    @GeneratedValue
    private int orderId;
    private LocalDate orderDate;
    private int qty;
    private int prdId;
}
