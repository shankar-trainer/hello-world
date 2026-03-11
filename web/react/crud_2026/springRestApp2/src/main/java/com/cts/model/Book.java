package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long isbn;
    private String name;
    private Float cost;
    private LocalDate publishDate;

}
