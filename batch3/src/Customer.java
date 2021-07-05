
public class Customer {

	private int customerId;
	private String customerName;
	private String customerLocation;
	private Product product;

	public Customer(int customerId, String customerName, String customerLocation, Product product) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.product = product;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerLocation() {
		return customerLocation;
	}

	public Product getProduct() {
		return product;
	}

}
