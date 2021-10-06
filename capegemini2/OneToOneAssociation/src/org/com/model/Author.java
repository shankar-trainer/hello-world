package org.com.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="author1")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int author_regno;
	private String author_name;
	private int author_age;

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(name = "book2", joinColumns = { @JoinColumn(name = "author_regno") }, inverseJoinColumns = {
			@JoinColumn(name = "isbn") })
	// @JoinColumn(name = "bookid")
	private Book book;

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String author_name, int author_age, Book book) {
		super();

		this.author_name = author_name;
		this.author_age = author_age;
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [author_regno=" + author_regno + ", author_name=" + author_name + ", author_age=" + author_age
				+ "]";
	}
}
