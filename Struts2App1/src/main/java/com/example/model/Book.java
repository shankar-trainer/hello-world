package com.example.model;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Book extends ActionSupport {
	private int isbn;
	private String bname;
	private String author;
	private float cost;
	private List list1;

	public List getList1() {
		return list1;
	}

	public void setList1(List list1) {
		this.list1 = list1;
	}

	public Book() {
		
	}
	public Book(int isbn, String bname, String author, float cost) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.author = author;
		this.cost = cost;
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

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String execute() throws Exception {
		list1 = new ArrayList();
		list1.add(new Book(1004, "java in action", "s kumar", 3456));
		list1.add(new Book(1001, "java beginner", "a kumar", 2000));
		list1.add(new Book(1006, "java for dummies", "geetha rani", 2300));
		list1.add(new Book(1002, "java for expert", "selva rani", 2500));
		list1.add(new Book(1003, "struts2 professional", "amita bhushan", 1100));
		list1.add(new Book(1005, "struts2 in action", "savita srivastava", 1400));
		list1.add(new Book(1007, "struts 2 using gradle", "amrita kaur", 3000));
		return SUCCESS;
	}
}
