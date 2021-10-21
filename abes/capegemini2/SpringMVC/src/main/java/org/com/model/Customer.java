package org.com.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int cid;
	private String name;
	private String ssn;

	@PostConstruct
	public void init() {
		cid = 988989;
		name = "suman kumar";
		ssn = "ssn6776676";
		System.out.println("init method called");
	}

	@PreDestroy
	public void clean() {
		System.out.println("destroy called");
	}

	@Autowired
	private Phone phone;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", ssn=" + ssn + ", phone=" + phone + "]";
	}

}
