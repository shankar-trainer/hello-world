package org.com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
	

	private int id;
	private String name;
	private float salary;
	
  @PostConstruct
	public void init() {
		this.id=90099;
		this.name="aman kumar";
		this.salary=78000;
	}
	
}
