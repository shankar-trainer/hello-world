package org.com.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Order1")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int order_id;
	
	@Temporal(TemporalType.DATE)
	private Date order_date;
	
	@ManyToMany(mappedBy = "order_set")
	//@JoinColumn(name="productid")
	private Set<Product> product_set;

	public Set<Product> getProduct_set() {
		return product_set;
	}

	public void setProduct_set(Set<Product> product_set) {
		this.product_set = product_set;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Date getOrder_date() {
		return order_date;
	}

	public void setOrder_date(Date order_date) {
		this.order_date = order_date;
	}
	

}
