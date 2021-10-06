package org.com;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Employee {
	
	@NotNull(message="id is blank")
	private Integer id;

	@NotNull(message="Name is blank")
	@NotBlank(message="Name is blank")
	private String name;
	
	@NotNull(message="Location is blank")
	@Size(min=1, max=4, message="Location is blank ")
	private String location[];
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getLocation() {
		return location;
	}
	public void setLocation(String[] location) {
		this.location = location;
	}
}
