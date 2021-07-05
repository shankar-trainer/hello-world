
public class Customer {
	private int customerId;
	private String customerName;
	private int prdId;
	private String prdName;
	private float prdCost;

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

	public int getPrdId() {
		return prdId;
	}

	public void setPrdId(int prdId) {
		this.prdId = prdId;
	}

	public String getPrdName() {
		return prdName;
	}

	public void setPrdName(String prdName) {
		this.prdName = prdName;
	}

	public float getPrdCost() {
		return prdCost;
	}

	public void setPrdCost(float prdCost) {
		this.prdCost = prdCost;
	}

	public static void main(String[] args) {
		Customer customer = new Customer();
		
		System.out.println("Customer Record ");
		System.out.println("Id " + customer.customerId);
		System.out.println("Name " + customer.customerName);
		System.out.println("product id  " + customer.prdId);
		System.out.println("product name " + customer.prdName);
		System.out.println("product cost " + customer.prdCost);
		
		
		customer.customerId=998998;
		customer.customerName="pankaj kumar";
		customer.prdId=1;
		customer.prdName="jeans pant ";
		customer.prdCost=777;
		
		System.out.println("\nCustomer Record ");
		System.out.println("Id " + customer.customerId);
		System.out.println("Name " + customer.customerName);
		System.out.println("product id  " + customer.prdId);
		System.out.println("product name " + customer.prdName);
		System.out.println("product cost " + customer.prdCost);
		
	}

}
