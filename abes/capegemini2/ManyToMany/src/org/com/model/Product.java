package org.com.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String prd_name;
	@ManyToMany
	//@JoinColumn(name="orderid")
	private Set<Order> order_set;
	
	public Set<Order> getOrder_set() {
		return order_set;
	}
	public void setOrder_set(Set<Order> order_set) {
		this.order_set = order_set;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPrd_name() {
		return prd_name;
	}
	public void setPrd_name(String prd_name) {
		this.prd_name = prd_name;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", prd_name=" + prd_name + "]";
	}
	
	

}
