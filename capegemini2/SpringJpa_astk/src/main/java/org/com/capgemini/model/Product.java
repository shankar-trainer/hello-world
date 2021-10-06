package org.com.capgemini.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Generated;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prd_id;
	private String prd_name;
	private float prd_cost;
	
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
	public float getPrd_cost() {
		return prd_cost;
	}
	public void setPrd_cost(float prd_cost) {
		this.prd_cost = prd_cost;
	}
	
	@Override
	public String toString() {
		return "Product [prd_id=" + prd_id + ", prd_name=" + prd_name + ", prd_cost=" + prd_cost + "]";
	}
	
	
	

}
