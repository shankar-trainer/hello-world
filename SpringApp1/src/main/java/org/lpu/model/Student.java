package org.lpu.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	private int roll;
	private String name;
	private float marks;
	private Set<String> books;
	private List<String> exams;
	private Map<String,Float> fee;
	
	
	private Address address;
	

	public Set<String> getBooks() {
		return books;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	public List<String> getExams() {
		return exams;
	}
	public void setExams(List<String> exams) {
		this.exams = exams;
	}
	public Map<String, Float> getFee() {
		return fee;
	}
	public void setFee(Map<String, Float> fee) {
		this.fee = fee;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	
	
	
}
