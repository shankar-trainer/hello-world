
public class CustomerMain {
	public static void main(String[] args) {

		Customer customer1=new Customer();
		
//		customer1.custId=-878778;
//		customer1.custName="a";
//		customer1.custLocation="b";
//		
//		System.out.println(customer1.custId);
//		System.out.println(customer1.custName);
//		System.out.println(customer1.custLocation);
//		
	
		customer1.setCustId(10001);
		customer1.setCustName("a kumar");
		customer1.setCustLocation("chennai");
		
		System.out.println(customer1.getCustId());
		System.out.println(customer1.getCustName());
		System.out.println(customer1.getCustLocation());

	}
}
