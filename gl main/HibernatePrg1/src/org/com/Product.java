package org.com;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="prd3")
@IdClass(ProductId.class)
public class Product {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="prd_id", length=10)
	private int pid;
	
	@Id
	@Column(name="prd_name", length=20, nullable=false)
	private String name;
	
	private String location;
	
	private Date mfd;
	
	
	public Date getMfd() {
		return mfd;
	}
	public void setMfd(Date mfd) {
		this.mfd = mfd;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
