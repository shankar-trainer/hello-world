import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {

		int id[] = { 989898, 787878, 676767, 6676776, 565656 };
		String name[] = { "ashok kumar", "amit kumar", "dhiraj kumar", "rahul kumar", "akash kumar" };
		String location[] = { "hyderbad", "vijaybada", "sikandarabad", "amrabati", "visakhapattanam" };
		String dob[] = { "12-08-1998", "15-07-1991", "1-08-1994", "20-04-1999", "26-09-1998" };
		float salary[] = { 20000, 90000, 67000.05f, 45000.06f, 566776.00567f };

		Customer customer[] = new Customer[5];// array

		for (int i = 0; i < customer.length; i++) {
			customer[i] = new Customer(id[i], name[i], location[i], dob[i], salary[i]);
		}

		Customer.customerInfo(customer);

		System.out.println("Total salary is " + Customer.getTotalSalary(customer));
		System.out.println("Average  salary is " + Customer.getAverageSalary(customer));
		Customer.customerInfoWithGrossSalary(customer);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter customer id to search ");
		int id1 = sc.nextInt();

		if (Customer.searchCustomerById(customer, id1) != null) {
			System.out.println("customer found ");
			Customer c = Customer.searchCustomerById(customer, id1);
			c.CustomerInfo();
		} else
			System.out.println("customer not  found ");
		
		Customer.getMaxMinSalary(customer);

	}
}
