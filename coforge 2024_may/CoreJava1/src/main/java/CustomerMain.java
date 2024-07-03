
public class CustomerMain {

	public static void main(String[] args) {
		int id1[] = { 90001, 20002, 20003 };
		String nm[] = { "sdurendra", "dharmendra", "amitendra" };
		float sal[] = { 34000, 45000, 67000 };

		Customer customer[] = new Customer[3];
		// created array but not object for each element

//		customer[0] = new Customer();
//		customer[0].id = 10001;
//		customer[0].name = "amit kumar";
//		customer[0].salary = 20000;

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer(); // object
			customer[i].id = id1[i];
			customer[i].name = nm[i];
			customer[i].salary = sal[i];
		}

		for (Customer customer2 : customer) {
			customer2.customerInfo();
		}

	}
}
