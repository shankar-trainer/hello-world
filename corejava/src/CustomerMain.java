
public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		
		//customer.customerId=-988787;
		//customer.customerName="";
		
		customer.setCustomerId(10001);
		customer.setCustomerName("amit kumar");
		
		
		System.out.println("id is "+customer.getCustomerId());
		System.out.println("name is "+customer.getCustomerName());
		
		
		
	}
}
