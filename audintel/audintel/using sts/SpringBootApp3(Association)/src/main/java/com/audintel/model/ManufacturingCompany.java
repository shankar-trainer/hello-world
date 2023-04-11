package com.audintel.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class  ManufacturingCompany {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long companyId;
	private String companyName;
	private String companyLocation;
	private String companyState;
	
}
