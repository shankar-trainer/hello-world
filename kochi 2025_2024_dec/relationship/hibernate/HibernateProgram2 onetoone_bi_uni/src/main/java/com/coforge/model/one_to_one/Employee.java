package com.coforge.model.one_to_one;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private float salary;

	@OneToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="address_id")
	private Address address;
	
	@OneToMany(cascade = CascadeType.ALL)
	private Set<Car> carSet;
}
