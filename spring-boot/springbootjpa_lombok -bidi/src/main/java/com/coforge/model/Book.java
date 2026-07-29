package com.coforge.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.repository.cdi.Eager;

import java.util.Set;

@Entity
//@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue
    private Long isbn;
    private String bname;
    private float cost;

    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Author author;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book",
            fetch = FetchType.EAGER)
    private Set<Publisher> publisherSet;
}
