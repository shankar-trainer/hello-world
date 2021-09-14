
public class CustomerMain {

	public static void main(String[] args) {
		Customer customer = new Customer();
		//Customer customer ; // error 
		
		//customer.customerId=-8988;   // error 
		//customer.customerName="123";
		
	    customer.setCustomerId(88787);
	    customer.setCustomerName("deepak kumar");
	    customer.setCustomerLocation("chennai");

	    customer.customerInfo();
	    
	    Customer customer2[]=new Customer[3];// array of object  not object of each element 
	    
	    customer2[0]=new Customer();// object 
	    customer2[1]=new Customer();// object 
	    customer2[2]=new Customer();// object 
	  
	    customer2[0].setCustomerId(7798789);
	    customer2[0].setCustomerName("kamal");
	    customer2[0].setCustomerLocation("sri hari kota");
	    
	   // customer2[0].customerInfo();
	    
	
	    customer2[1].setCustomerId(7798781);
	    customer2[1].setCustomerName("vimal kumar");
	    customer2[1].setCustomerLocation("amritsar");
	    
	    //customer2[1].customerInfo();
	    
	    for (Customer customer3 : customer2) {
			customer3.customerInfo();
		}
	    
	    
	}
}
