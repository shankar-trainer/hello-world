package com.conforge.model.many_to_many;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "order1")
@Getter
@Setter
@ToString
@AllArgsConstructor
//@NoArgsConstructor

public class Order {
	@Id
	@GeneratedValue
	private int orderId;

	private String orderName;
	private String orderLocation;

	@ManyToMany(mappedBy = "orderSet")
	Set<Product> productSet;

	public Order() {
	}

	public Order(int orderId, String orderName, String orderLocation) {
		super();
		this.orderId = orderId;
		this.orderName = orderName;
		this.orderLocation = orderLocation;
	}

}
