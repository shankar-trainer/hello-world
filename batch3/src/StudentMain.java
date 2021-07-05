
public class StudentMain {

	public static void main(String[] args) {

		Product product = new Product(6756556, "formal trouser", 1200);

		Customer customer = new Customer(344334, "ranjeet kumar", "delhi", product);

		System.out.println("customer Information ");

		System.out.println("id " + customer.getCustomerId());
		System.out.println("name " + customer.getCustomerName());
		System.out.println("location " + customer.getCustomerLocation());

		Product prd1 = customer.getProduct();

		System.out.println("\nProduct data \n");
		
		System.out.println(" id "+prd1.getProductId());
		System.out.println(" name  "+prd1.getProductName());
		System.out.println(" cost  "+prd1.getProductCost());
	}

}
