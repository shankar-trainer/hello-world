package com.coforge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Friend {


	@Id
	@GeneratedValue
	private int friendId;
	
	private int age;
	private String name;
	
	
	
}
