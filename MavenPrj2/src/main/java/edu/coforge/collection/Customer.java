package edu.coforge.collection;

public class Customer  implements Comparable<Customer>{

	private int customerId;
	private  String customerName;
	private float customerSalary;
	
	public Customer(int customerId, String customerName, float customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerSalary = customerSalary;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerSalary="
				+ customerSalary + "]";
	}

//	@Override
//	public int compareTo(Customer o) {
//		if(this.customerId<o.customerId)
//		return -1;
//		else	if(this.customerId>o.customerId)
//			return 1;
//		else 
//			return 0;
//	}	
	
	@Override
	public int compareTo(Customer o) {
//		return new Integer(this.customerId).compareTo(new Integer(o.customerId));
		return Integer.valueOf(this.customerId).compareTo(Integer.valueOf(o.customerId));
	}
}
