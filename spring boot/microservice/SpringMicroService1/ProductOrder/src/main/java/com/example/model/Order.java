package com.example.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "order1")
public class Order {

    @Id
    @GeneratedValue
    private int orderId;
    private  String  orderName;
    private  String  orderLocation;
    private LocalDate orderDate;

    @Embedded
    Product product;
}
