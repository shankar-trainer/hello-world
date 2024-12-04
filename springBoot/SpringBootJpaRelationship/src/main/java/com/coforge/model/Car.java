package com.coforge.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
 public class Car {

    @Id
    @GeneratedValue
    private  long regNo;
    private  String model ;
    private  float  cost ;

}
