package org.example.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by shankar on 4/7/2023.
 */
@Entity
@Data
public class Student {


@Id
private int roll;
    private  String name;
    private  String subject;
    private  float marks;
    private Date dob;


}
