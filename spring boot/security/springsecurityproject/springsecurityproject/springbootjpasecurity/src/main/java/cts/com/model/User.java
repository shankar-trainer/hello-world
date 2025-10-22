package cts.com.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @GeneratedValue
    @Id
    private int id;
    @Column(unique = true)
    private String name;
    private String password;

}
