package com.cts.model;

import java.util.List;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class User {

	@NotNull(message = "id is null ")
	@Min(value = 10000,message = "id can be minimum 10000")
	@Max(value = 50000,message = "id  can be maximum 50000")

	private Integer id;
	
	@NotEmpty(message = "name is empty")
	@Size(min = 6, max=15, message = "name must be between 5 - 15 character")
	private String name;
	@NotNull(message = "salary is null ")
	
	@Min(value = 5000,message = "salary can be minimum 5000")
	@Max(value = 50000,message = "salary can be maximum 50000")
	private Float salary;
	
	//private List<String> hobbyList;
	// jsr 380 
    @NotEmpty(message = "Please select at least one hobby")
	@Valid
	private List<@NotBlank(message = "Hobby cannot be blank") 
    @Size(max = 20, message = "Hobby cannot exceed 20 characters") 
    String> hobbyList;
	
	//private List<String> cityList;
    @NotEmpty(message = "Please select a city")
    @Valid
	private List<@NotBlank(message = "city  cannot be blank") String> cityList;

    @NotEmpty(message = "Please select a gender")
	@Valid
	private List<@NotBlank (message = "gender cannot be blank") String> gender;

//	private List<String> gender;
	
	public List<String> getHobbyList() {
		return hobbyList;
	}
	public void setHobbyList(List<String> hobbyList) {
		this.hobbyList = hobbyList;
	}
	public List<String> getCityList() {
		return cityList;
	}
	public void setCityList(List<String> cityList) {
		this.cityList = cityList;
	}
	public List<String> getGender() {
		return gender;
	}
	public void setGender(List<String> gender) {
		this.gender = gender;
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
