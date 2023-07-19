package com.conforge.model.many_to_many;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Product {
	@Id
	@GeneratedValue
	private int prdId;
	private String prdName;
	private float prdCost;
	public Product() {
	}
	public Product(int prdId, String prdName, float prdCost) {
		super();
		this.prdId = prdId;
		this.prdName = prdName;
		this.prdCost = prdCost;
	}

	@ManyToMany
	Set<Order> orderSet;

}
