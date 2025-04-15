package com.example.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
//@Table(name="student")
public class Student {

	@Id
	@GeneratedValue
//	@Column(name = "studentRoll")
	private int roll;

	//@Column(name = "studentName", length = 30, nullable = false)
	private  String name;
	private  String subject;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addr_id")
	private Address address;
	

	@OneToMany(cascade = CascadeType.ALL)
	public Set<Course> courseSet;
}
