
public class Customer {

	int id;
	String name;
	String state;
	String country;
	
	
	public Customer(int id, String name, String state) {
		this(id,name,state,"india"); 
		this.id = id;
		this.name = name;
		this.state = state;
	}
	
	
	public Customer(int id, String name, String state,String country) {
		this.id = id;
		this.name = name;
		this.state = state;
		this.country=country;
	}
	
	void customerInfo() {
		System.out.println("Customer Information  ");
        System.out.println("Id "+id);    
        System.out.println("name "+name);    
        System.out.println("state "+state);    
        System.out.println("country "+country);    
	}

	public static void main(String[] args) {
		Customer customer=new Customer(5454, "ram kumar", "punjab");
	  customer.customerInfo();
	}
	
	
}
