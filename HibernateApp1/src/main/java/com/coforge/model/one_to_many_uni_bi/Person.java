package com.coforge.model.one_to_many_uni_bi;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Person {
	@Id
	@GeneratedValue
	private long personId;
	private String personName;
	private float personSalary;

	@OneToMany
	private Set<Car> carSet;

}
