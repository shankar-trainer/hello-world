package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //
    private UUID bookid;
    private String name;

    @Enumerated(EnumType.STRING)
    private BookCatalog bookCatalog;
    private float cost;

}
