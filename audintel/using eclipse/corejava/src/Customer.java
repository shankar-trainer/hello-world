
public class Customer {
	private int customerId;
	private String customerName;
	private String customerLocation;
	private String customerDob;
	private float customerSalary;

	public Customer(int customerId, String customerName, String customerLocation, String customerDob,
			float customerSalary) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerLocation = customerLocation;
		this.customerDob = customerDob;
		this.customerSalary = customerSalary;
	}

	public void CustomerInfo() {
		System.out.println("\nCustomer data");
		System.out.println("\tId " + customerId);
		System.out.println("\tName " + customerName);
		System.out.println("\tLocation " + customerLocation);
		System.out.println("\tDOB " + customerDob);
		System.out.println("\tSalary " + customerSalary);
	}

	public static void customerInfo(Customer cust[]) {
		for (Customer customer : cust) {
			System.out.println("\nCustomer data");
			System.out.println("\tId " + customer.customerId);
			System.out.println("\tName " + customer.customerName);
			System.out.println("\tLocation " + customer.customerLocation);
			System.out.println("\tDOB " + customer.customerDob);
			System.out.println("\tSalary " + customer.customerSalary);
		}
	}

	public static void customerInfoWithGrossSalary(Customer cust[]) {
		for (Customer customer : cust) {
			System.out.println("\nCustomer data");
			System.out.println("\tId " + customer.customerId);
			System.out.println("\tName " + customer.customerName);
			System.out.println("\tLocation " + customer.customerLocation);
			System.out.println("\tDOB " + customer.customerDob);
			System.out.println("\tSalary " + customer.customerSalary);
			System.out.println("\tGross Salary " + ((customer.customerSalary) - (customer.customerSalary * 0.05f)));
		}
	}
	
	public static void getMaxMinSalary(Customer cust[]) {
	              float max=0,min=0;
	              
	              for (Customer customer : cust) {
					if(customer.customerSalary>=max)
						max=customer.customerSalary;
					else
						min=customer.customerSalary;
				}
	              System.out.println("Customer max salary is "+max);
	              System.out.println("Customer min  salary is "+min);
	}

	public static float getTotalSalary(Customer cust[]) {
		float tot = 0.0f;
		for (Customer customer : cust) {
			tot = tot + customer.customerSalary;
		}
		return tot;
	}

	public static float getAverageSalary(Customer cust[]) {
		return getTotalSalary(cust) / cust.length;
	}

	public static Customer searchCustomerById(Customer cust[], int id) {
		for (Customer customer : cust) {
			if (customer.customerId == id)
				return customer;
		}
		return null;
	}
}