
public class CustomerMain1 {

	public static void main(String[] args) {
		int id[] = { 1001, 1009, 1008 };
		String name[] = { "paragati kumar", "sushant bhaskar ", "arvind kumar" };
		String location[] = { "gurgaon", "delhi", "noida" };

		Customer customer2[] = new Customer[3];

		for (int i = 0; i < customer2.length; i++) {
			customer2[i] = new Customer();             // create object each array element
			customer2[i].setCustomerId(id[i]);
			customer2[i].setCustomerName(name[i]);
			customer2[i].setCustomerLocation(location[i]);
		}

		// for each loop
		for (Customer customer : customer2) {
			customer.customerInfo();
		}
	}
}
