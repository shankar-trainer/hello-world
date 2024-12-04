package com.abc.model;

public class Book {

	private int isbn;
	private String name;
	private String author;
	private float cost;

	public Book(int isbn, String name, String author, float cost) {
		super();
		this.isbn = isbn;
		this.name = name;
		this.author = author;
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + isbn;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (isbn != other.isbn)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public int getIsbn() {
		return isbn;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public float getCost() {
		return cost;
	}

	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + ", cost=" + cost + "]";
	}

}
