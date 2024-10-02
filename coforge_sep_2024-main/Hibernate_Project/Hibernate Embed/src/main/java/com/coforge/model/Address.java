package com.coforge.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    private int addr_id;
    private String location;
    private String state;

    @OneToOne(mappedBy = "address",cascade = CascadeType.ALL,fetch=FetchType.EAGER)// mappedBy makes application as Bidirectional
    private User user;

}
