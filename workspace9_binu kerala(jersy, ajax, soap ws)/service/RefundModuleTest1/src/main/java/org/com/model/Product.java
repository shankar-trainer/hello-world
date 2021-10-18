package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int prd_id;
	private String prd_name;
	@OneToOne(mappedBy = "product")
	private Item item;

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product( String prd_name) {
		super();
		this.prd_name = prd_name;
	}

	public int getPrd_id() {
		return prd_id;
	}

	public void setPrd_id(int prd_id) {
		this.prd_id = prd_id;
	}

	public String getPrd_name() {
		return prd_name;
	}

	public void setPrd_name(String prd_name) {
		this.prd_name = prd_name;
	}
	@Override
	public String toString() {
		return "Product [prd_id=" + prd_id + ", prd_name=" + prd_name + "]";
	}

}
