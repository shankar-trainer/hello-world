package org.audintel.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Entity;

@Entity
@NamedQueries({
		@NamedQuery(name = "getAllBook",query = "select b from Book b"),
		@NamedQuery(name = "searchByName",query = "select b from Book b where b.name=:name1"),
		@NamedQuery(name = "deleteByIsbn",query = "delete  from Book b where b.isbn=?1"),
		
})
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int isbn;
	
	private  String name;
	private float cost;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
}
