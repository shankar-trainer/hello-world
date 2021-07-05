
public class CustomerMain {

	public static void main(String[] args) {
		Customer customer=new Customer();
		customer.setCustomerId(7887);
		customer.setCustomerName("gagan kumar");
		customer.setPrdId(1);
		customer.setPrdName("formal trouser");
		customer.setPrdCost(1200);
		
		System.out.println("Customer Record ");
		System.out.println("Id " + customer.getCustomerId());
		System.out.println("Name " + customer.getCustomerName());
		System.out.println("product id  " + customer.getPrdId());
		System.out.println("product name " + customer.getPrdName());
		System.out.println("product cost " + customer.getPrdCost());
				
		
	}
}
