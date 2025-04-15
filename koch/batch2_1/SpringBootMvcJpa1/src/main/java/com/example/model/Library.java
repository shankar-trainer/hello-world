package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Column;

@Entity
//@Table(name="mylibrary")
public class Library {
	@Id
	//@GeneratedValue
	//@Column(name="libid")
	@NotNull(message = "Id is blank")
	private Integer libraryId;
	
	//@Column(name="libName", length=20, nullable=false)
    @NotEmpty(message = "Name is blank")
	private String libraryName;
	
	//@Column(name="libLoc", length=20, nullable=false)
    @NotEmpty(message = "Location is blank")
    private String libraryLocation;

	public Integer getLibraryId() {
		return libraryId;
	}

	public void setLibraryId(Integer libraryId) {
		this.libraryId = libraryId;
	}

	public String getLibraryName() {
		return libraryName;
	}

	public void setLibraryName(String libraryName) {
		this.libraryName = libraryName;
	}

	public String getLibraryLocation() {
		return libraryLocation;
	}

	public void setLibraryLocation(String libraryLocation) {
		this.libraryLocation = libraryLocation;
	}

	@Override
	public String toString() {
		return "Library [libraryId=" + libraryId + ", libraryName=" + libraryName + ", libraryLocation="
				+ libraryLocation + "]";
	}

}
