public class Customer {

	int id;
	String name;
	float salary;
		
	void customerInfo() {
		System.out.println("Customer Information");
		System.out.println("\tid :"+id);
		System.out.println("\tname :"+name);
		System.out.println("\tsalary :"+salary);
	}
	
	public static void main(String[] args) {
		
		Customer customer1=new Customer();
		Customer customer2=new Customer();
		Customer customer3=new Customer();
		
		customer1.id=10001;
		customer1.name="amit kumar";
		customer1.salary=20000;
		
		customer2.id=10002;
		customer2.name="sumit kumar";
		customer2.salary=70000;
		
		customer3.id=10003;
		customer3.name="ramesh kumar";
		customer3.salary=90000;
		
		customer1.customerInfo();
		customer2.customerInfo();
		customer3.customerInfo();
		
	}
	
	
}
