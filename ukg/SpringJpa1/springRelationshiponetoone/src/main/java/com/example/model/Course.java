package com.example.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue
    private long  id;
    @Column(name = "name",length = 20, nullable = false)
    private String name;
    @Column(name = "duration", nullable = false)
    private int duration;

}
