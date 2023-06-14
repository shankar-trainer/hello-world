package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "order1")

public class Order {
    @Id
    //@GeneratedValue
    private int orderId;
    private String orderName;
    private String orderLocation;
}
