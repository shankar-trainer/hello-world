package com.audintel.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Product  implements Serializable  {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long prdId;
	private String prdName;
	private float prdCost;

	@OneToMany(fetch = FetchType.EAGER)
	private Set<ProductOrder> prdOrderSet;
	
	@OneToOne
	private ManufacturingCompany  company;
	
}
