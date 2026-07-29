package com.coforge.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
//@Data
public class Publisher {
    @Id
    @GeneratedValue
    private UUID publisherId;
    private String publisherName;
    private String publisherLocation;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private Book book;


}
