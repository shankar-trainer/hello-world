package com.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "MenuItem")
@ToString(exclude = {"ordereList"})
@EqualsAndHashCode(exclude = {"ordereList"} )

@Data
public class MenuItem  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemID;

    @Column(name = "RestaurantID")
    private int restaurantID;
    private String name;
    private String description;
    private double price;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnoreProperties("menuItems")
    List<Order> ordereList;
}