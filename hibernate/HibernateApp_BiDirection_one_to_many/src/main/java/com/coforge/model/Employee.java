package com.coforge.model;

import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//import com.fasterxml.jackson.annotation.JsonBackReference;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@ToString
@Entity
public class Employee {

	@Id
	@GeneratedValue
	private long empId;
	private String empName;
	private LocalDate dob;
	
	
	// owning class  
	//@JsonBackReference

	@ManyToOne(cascade = CascadeType.ALL)
	private Department department;
 
	
	
}
