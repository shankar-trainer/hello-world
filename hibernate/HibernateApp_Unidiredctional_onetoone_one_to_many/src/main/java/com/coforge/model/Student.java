package com.coforge.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Student {

	@Id
	@GeneratedValue
	private int roll;
	
	private String name;
	private String subject;
	
	// Student has a address , has a relationship 
	
	@OneToOne(cascade = CascadeType.ALL)
	//@OneToOne(cascade = CascadeType.PERSIST)
	
	@JoinColumn(name="addr_id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Friend> friendSet;
	
}
