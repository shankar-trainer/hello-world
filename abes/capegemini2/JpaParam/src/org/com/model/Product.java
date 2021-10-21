package org.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
//@Table(name="Product1")
@NamedQueries(

{ @NamedQuery(query = "from Product", name = "showAllProduct"),
  @NamedQuery(query = "select p from Product p where p.prd_cost>=?1", name = "showAllProduct1") }

)

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prd_id;
	private String prd_name;
	private float prd_cost;

	@Override
	public String toString() {
		return "Product [prd_id=" + prd_id + ", prd_name=" + prd_name + ", prd_cost=" + prd_cost + "]";
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

	public float getPrd_cost() {
		return prd_cost;
	}

	public void setPrd_cost(float prd_cost) {
		this.prd_cost = prd_cost;
	}

}
