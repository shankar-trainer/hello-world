package org.com;

public class Customer {

	private int cid;
	private String cname;
	
	public Customer(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	
	@Override
	public String toString() {
		return "Customer Info\n\tId is "+cid+
				"\n\tName is "+cname;
	}
	
}
