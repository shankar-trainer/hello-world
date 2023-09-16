package com.coforge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Library {

	@Id
	@GeneratedValue
	private long libraryId;
	private String libraryName;
	private String libraryLocation;

}
