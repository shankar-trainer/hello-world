package com.capgemini.beans.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Book {

	private int isbn;
	private String bname;
	private float cost;
	
	//@Autowired
	@Resource
	private Chapter chapter;
	
	public Chapter getChapter() {
		return chapter;
	}

	public void setChapter(Chapter chapter) {
		this.chapter = chapter;
	}

	@PostConstruct
	public void init() {
		System.out.println("init called ");
		this.isbn=9898989;
		this.bname="life beyond";
		this.cost=678.00f;
	} 
	
	@PreDestroy
	public void cleaup() {
	System.out.println("clean up called ");	
	}
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	@Required
	public String getBname() {
		return bname;
	}
	@Required
	public void setBname(String bname) {
		this.bname = bname;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
}
