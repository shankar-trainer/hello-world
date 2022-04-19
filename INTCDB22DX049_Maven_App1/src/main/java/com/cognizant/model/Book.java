package com.cognizant.model;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Book {

	private int isbn;
	private String publication;
	private List<String> javaBookList;
	private Set<String> sqlBookList;
	private Map<String,Float> springbookMap;
	
	public Map<String, Float> getSpringbookMap() {
		return springbookMap;
	}
	public void setSpringbookMap(Map<String, Float> springbookMap) {
		this.springbookMap = springbookMap;
	}
	
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getPublication() {
		return publication;
	}
	public void setPublication(String publication) {
		this.publication = publication;
	}
	public List<String> getJavaBookList() {
		return javaBookList;
	}
	public void setJavaBookList(List<String> javaBookList) {
		this.javaBookList = javaBookList;
	}
	public Set<String> getSqlBookList() {
		return sqlBookList;
	}
	public void setSqlBookList(Set<String> sqlBookList) {
		this.sqlBookList = sqlBookList;
	}
	
	
	
	
	
}
