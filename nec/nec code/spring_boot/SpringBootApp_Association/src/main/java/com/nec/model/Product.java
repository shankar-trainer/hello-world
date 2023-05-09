package com.nec.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product  implements Serializable{
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prdId;
	private String prdName;
	private float prdCost;
	
	@OneToOne()
	@JoinColumn(name="productOrderId")
	private Order order;

	@OneToMany
	private Set<ProductFeedback> productFeedBackSet;
	
	
}
