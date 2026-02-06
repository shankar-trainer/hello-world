package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int authorId;
    private String authorName;
    private String authorLocation;

    @OneToOne(mappedBy ="author" ,cascade = CascadeType.ALL)
    private  Book book;

}
