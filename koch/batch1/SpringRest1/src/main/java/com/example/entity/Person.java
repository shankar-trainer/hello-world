package com.example.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data//@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode. 
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

	@Id
	private int id;
	private  String name;
	private  float salary;
	private  LocalDate dob;
	
}
