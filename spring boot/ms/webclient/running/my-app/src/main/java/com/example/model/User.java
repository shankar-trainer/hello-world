package com.example.model;

//import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
//@Document
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="user1")
public class User {

    @Id
    // @GeneratedValue// will not work in mongo db
    private  int   userId;
    private String name;


}
