package org.example.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "order1")
public class Order {

    @Id
    @GeneratedValue()
    private int orderId;
    private String  orderName;
    private float orderCost;





}
