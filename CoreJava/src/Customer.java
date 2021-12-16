
public class Customer {

	private int customerId;
	private String customerName;
	private float customerSalary;
	private float customerPF;
	
	public void setCustomerPF(float customerPF) {
		this.customerPF = customerPF;
	}

	private String customerLocation;
	

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerSalary(float customerSalary) {
		this.customerSalary = customerSalary;
	}

	public void setCustomerLocation(String customerLocation) {
		this.customerLocation = customerLocation;
	}

	public float getGrossSalary() {
		return customerSalary-customerSalary*customerPF;
	}
	
	public void customerInfo() {
		System.out.println("\nCustomer Information\n");
		System.out.println("\tId is " + customerId);
		System.out.println("\tName is " + customerName);
		System.out.println("\tSalary is " + customerSalary);
		System.out.println("\tLocation is " + customerLocation);
		System.out.println("\tPF is " + customerPF);
		System.out.println("\tGross Salary  is " + getGrossSalary());
	}
}
