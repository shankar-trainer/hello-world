package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data

@Entity
@Table(name = "Users")
public class User {

    @GeneratedValue
    @Id
    private int id;
    private String userName;
    private String password;

}
