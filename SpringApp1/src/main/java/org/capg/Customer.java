package org.capg;

public class Customer {

	private int customerId;
	private String customerName;
	private String  customerLocation;
	
	public Customer(int customerId, String customerName, String customerLocation) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
	}

	@Override
	public String toString() {
		return "Customer Data \n\tcustomerId=" + customerId + ", \n\tcustomerName=" + customerName + ", \n\tcustomerLocation="
				+ customerLocation + "]";
	}
	
	
	
	
}
