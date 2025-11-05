package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
public class Book {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer isbn;
    private  String bname;
}
