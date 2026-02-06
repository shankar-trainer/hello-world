package com.cts.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
@Table(name = "user2")
public class User {
    @Id
    @GeneratedValue
    private int userId;
    private String userName;

    @Enumerated(EnumType.STRING)
    private Payment_type paymentMode;

    @Embedded
    private Address address;

    @ElementCollection
    @CollectionTable(name = "myphoneset")
    private Set<Phone> phoneSet;

    @ElementCollection
    private Set<String> emailSet;


}
