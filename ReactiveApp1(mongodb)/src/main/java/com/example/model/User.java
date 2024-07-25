package com.example.model;

import org.springframework.data.mongodb.core.mapping.Document;

//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.Id;
import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;

@Data
@Document
@Builder
public class User {
    @Id
   // @GeneratedValue// will not work in mongo db
    private  String  id;
    private String name;
}
