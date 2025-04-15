package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data//@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 
public class Person {

	@Id
	private int id;
	private  String name;
	private  float salary;
	private  LocalDate dob;
	
}
