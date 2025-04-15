package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import jakarta.transaction.Transaction;
import lombok.*;

@Entity
//@Table(name = "tableforordering")
@Table(name = "order1")
@Data
@ToString(exclude = {"customer","menuItems"})
@EqualsAndHashCode(exclude = {"customer","menuItems"} )

//@AllArgsConstructor
//@NoArgsConstructor
public class Order implements Serializable {
	@Id
    @GeneratedValue//(strategy = GenerationType.IDENTITY)
    private int orderID;

   // @Column(name = "RestaurantID")
    private int restaurantID;
    private String status;
    private double totalAmount;

    @ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "Order_MenuItem",
            joinColumns = @JoinColumn(name = "OrderID"),
            inverseJoinColumns = @JoinColumn(name = "ItemID")
    )

   //@ManyToMany( cascade = CascadeType.ALL,fetch = FetchType.EAGER, mappedBy = "ordereList")

     @JsonIgnoreProperties("ordereList")
    private List<MenuItem> menuItems = new ArrayList<>();

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    //@JoinColumn(name = "CustomerID", nullable = false)
    @JsonIgnoreProperties("orders")
    private Customer customer;
}