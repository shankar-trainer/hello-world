package org.model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Customer {

	// @Pattern(regexp="[0-9]+", message="id should be number")
	@NotNull(message = "id is blank")

	private Integer id;
	@NotEmpty(message = "name is empty")
	@Pattern(regexp = "[a-zA-Z]+\\s[a-zA-Z]+", message = "name must of two words")
	private String name;

	@Digits(integer = 5, fraction = 2, message = "salary not of 5 digit and two decimal")
	@NotNull(message = "salary is blank")
	private Float salary;
	@NotNull(message = "select gender")
	private String gender;
	@Size(max = 5, min = 1, message = "hobby not selected")
	private String hobby[];

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobby() {
		return hobby;
	}

	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}

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

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

}
