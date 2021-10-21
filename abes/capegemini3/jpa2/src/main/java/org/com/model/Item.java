package org.com.model;
//package org.com.pl;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Item implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int item_id;
	private String item_name;
	private float item_cost;
	private int item_qty;

	@OneToMany(mappedBy="item")
	//@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER,mappedBy="item")
	  @JsonManagedReference
	private Set<Product> product_set;

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

	public Set<Product> getProduct_set() {
		return product_set;
	}

	public void setProduct_set(Set<Product> product_set) {
		this.product_set = product_set;
	}

	@Override
	public String toString() {
		return "Item [item_id=" + item_id + ", item_name=" + item_name + ", item_cost=" + item_cost + ", item_qty="
				+ item_qty + ", product_set=" + product_set + "]";
	}
	
	
}
