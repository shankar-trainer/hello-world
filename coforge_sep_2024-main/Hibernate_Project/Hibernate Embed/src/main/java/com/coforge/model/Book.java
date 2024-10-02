package com.coforge.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private int isbn;
    private String bname;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
}
