package com.example.model;

//import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Document
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    // @GeneratedValue// will not work in mongo db
    private  int   userId;
    private String name;


}
