
//public
class Customer {
	private int customerId;   //data is private
	private  String customerName;
	private String  customerLocation;
		                                         // this   -- current class reference variable 
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}
	
	public void  customerInfo() {
		System.out.println("\ncustomer information \n");
		System.out.println("id is "+getCustomerId());
	    System.out.println("name is "+getCustomerName());
	    System.out.println("location is "+getCustomerLocation());
	    
	}
	
}
