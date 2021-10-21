package org.com.model;

public class Customer {

	private int cid;
	private String name;
	private String ssn;
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
