
public class CustomerMain {
	
	public static void main(String[] args) {
		
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		Customer customer3=new Customer();
		
		customer1.setCustomerId(788787);
		customer1.setCustomerName("amrendra kumar");
		customer1.setCustomerSalary(67000);
		customer1.setCustomerLocation("delhi");
		customer1.setCustomerPF(0.05f);
		
		customer2.setCustomerId(788781);
		customer2.setCustomerName("surendra kumar");
		customer2.setCustomerSalary(43000);
		customer2.setCustomerLocation("noida");
		customer2.setCustomerPF(0.06f);
		
		customer3.setCustomerId(788780);
		customer3.setCustomerName("virendra kumar");
		customer3.setCustomerSalary(17000);
		customer3.setCustomerLocation("gurgaon");
		customer3.setCustomerPF(0.055f);
		
		customer1.customerInfo();
		customer2.customerInfo();
		customer3.customerInfo();
	}
}
