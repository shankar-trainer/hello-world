
public class ManagerMain {

	
	public static void main(String[] args) {
		
		Manager manager=new Manager();
		manager.setId(1001);
		manager.setName("suresh kumar");
		manager.setSalary(23456.789f);
		
		Address address=new Address();
		address.setCity("Ghaziabad");
		address.setSector("sector4");
		address.setState("UP");
		address.setCountry("India");
		address.setPin(767676);
		
		manager.setAddress(address);
	
		System.out.println("Manager Information");
		System.out.println("\tId is "+manager.getId());
		System.out.println("\tName is "+manager.getName());
		System.out.println("\tSalary is "+manager.getSalary());
		
		System.out.println("\nManager Address is ");
		System.out.println("\tCity is "+manager.getAddress().getCity());
		
		Address address2=manager.getAddress();
		
		System.out.println("\tCity is "+address2.getCity());
		System.out.println("\tSector is "+address2.getSector());
		System.out.println("\tState is "+address2.getState());
		
		System.out.println("\tCountry is "+address2.getCountry());
		System.out.println("\tPin is "+address2.getPin());
		
		
		
		
		
		
	}
}
