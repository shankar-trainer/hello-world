package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data//@Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {

	private int id;
	private  String name;
	private  float salary;
	private  LocalDate dob;
	private String address[];
	
}
