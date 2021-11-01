package org.capg.model;

public class Book {

	private int isbn;
	private String bname;
	private float cost;

	public void init() {

		System.out.println("book init called");
		isbn = 78788;
		bname = "JPA beginner";
		cost = 1200;
	}

	public void cleanup() {
		System.out.println("boook destroy  called");
		isbn = 0;
		bname = null;
		cost = 0;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

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
