package com.coforge.model;

import lombok.Builder;
import lombok.Data;


import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Builder
public class Product {
    @Id
    @GeneratedValue
    private  int prdId;
    private  String prdName;
    private  float  prdCost;

    @ManyToMany(mappedBy = "productSet", cascade = CascadeType.ALL)
    private Set<Order>  orderSet;
}
