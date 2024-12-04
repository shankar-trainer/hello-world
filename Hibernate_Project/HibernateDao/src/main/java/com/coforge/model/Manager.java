package com.coforge.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Manager {
 @Id
 @GeneratedValue
 private long managerId;
 private String mangerName;
 private  float salary;
 private LocalDate dob;



}
