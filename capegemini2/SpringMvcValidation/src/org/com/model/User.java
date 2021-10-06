package org.com.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class User {

	// @Pattern(regexp = "[0-9]+",message = "id cannot have character")
	
	@NotNull(message = "id is blank")
	private Integer id;

	@Size(max = 20, min = 5, message = "name length must be between 5 - 20	 chars")
	@NotEmpty(message = "name is blank")
	private String uname;

	@Digits(integer = 5, fraction = 2, message = "salary not of 5 digit or fraction of 2 decimal")
	@NotNull(message = "salary is blank")
	private Float usalary;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Float getUsalary() {
		return usalary;
	}

	public void setUsalary(Float usalary) {
		this.usalary = usalary;
	}

}
