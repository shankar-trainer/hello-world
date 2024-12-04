package com.coforge.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
@Table(name = "order1")
public class Order {
    @Id
    @GeneratedValue
    private  int orderId;
    private  String orderName;
    private  String orderLocation;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Product> productSet;

}
