
public class CustomerMain {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
//		customer.id=0;
//		customer.name="";
	//	customer.salary=-0;

		customer.setId(878787);
		customer.setName("anand kumar");
		customer.setSalary(78000);

		System.out.println("id is "+customer.getId());
		System.out.println("name is "+customer.getName());
		System.out.println("salary is "+customer.getSalary());
	
		System.out.println("Country name is "+Customer.Country);
		Customer.Country="nepal";
		System.out.println("Country name is "+Customer.Country);
		
		Math m;
		// java.lang -- is present by default 
		
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.sin(Math.PI/2));
		
		final int p=999;
		
		
		
		
	}
}
