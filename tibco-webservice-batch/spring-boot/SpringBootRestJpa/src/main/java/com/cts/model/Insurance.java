package com.cts.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "bajaj_insurance")
//@Setter
//@Getter
//@ToString
//@EqualsAndHashCode

@Data
public class Insurance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "insurance_id ")
	private int id;
	
	@Column(name = "insurance_name", nullable = false, length = 20, unique = true)
	private String name;
	private int maturity_year;
	private float emi;

}
