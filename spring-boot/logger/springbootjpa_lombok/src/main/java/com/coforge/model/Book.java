package com.coforge.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue
    private long isbn;
    private String bname;
    private float cost;
    @OneToOne(cascade = CascadeType.ALL)
    private Author author;
    @OneToMany (cascade = CascadeType.ALL)
    private Set<Publisher> publisherSet;
}
