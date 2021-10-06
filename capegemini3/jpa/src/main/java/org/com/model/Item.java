package org.com.model;
//package org.com.pl;

import java.io.Serializable;
import java.util.HashMap;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Item implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int item_id;
	private String item_name;
	private float item_cost;
	private int item_qty;
	
	

	public Item(String item_name, float item_cost, int item_qty, Product product) {
		super();
		this.item_name = item_name;
		this.item_cost = item_cost;
		this.item_qty = item_qty;
		this.product = product;
	}

	@OneToOne
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}


	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_cost=" + item_cost + ", item_qty="
				+ item_qty + ", product=" + product + "]";
	}

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public float getItem_cost() {
		return item_cost;
	}

	public void setItem_cost(float item_cost) {
		this.item_cost = item_cost;
	}

	public int getItem_qty() {
		return item_qty;
	}

	public void setItem_qty(int item_qty) {
		this.item_qty = item_qty;
	}

	public Item() {
		// TODO Auto-generated constructor stub
	}
}
