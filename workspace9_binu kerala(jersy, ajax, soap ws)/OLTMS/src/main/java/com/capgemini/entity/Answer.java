package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Answer")
public class Answer {
 
	@Id
	private int id;
 private String value;
 
 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public Answer(int id, String value) {
		
		this.id = id;
		this.value = value;
	}
	public Answer() {
		
	}
	
 
}
