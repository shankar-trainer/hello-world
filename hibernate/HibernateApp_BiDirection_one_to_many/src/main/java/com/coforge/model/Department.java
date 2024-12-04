package com.coforge.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//@Data
@Getter
@Setter
@ToString

@Entity
public class Department {

	@Id
	@GeneratedValue
	private long deptId;
	private String deptName;
	private int  totalMember;
	
	
	// inverse class 
	//@JsonManagedReference

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department")
	private Set<Employee> employeeSet;
 
	
}
