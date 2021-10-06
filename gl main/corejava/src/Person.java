public class Person {
	static String country="india";
	int id;
	String name;

	void info() {
		System.out.println(" id is " + id);
		System.out.println(" name is " + name);
	}
}
class Customer extends Person {
	float cost;
	
	@Override
	void info() {
		super.info();
		System.out.println("cost is "+cost);
	}
}

class Passenger extends Person {
	String location;
	
	@Override
	void info() {
		super.info();
		System.out.println("location  is "+location);
		System.out.println("Country  is "+country);
		
	}
}

/*class abc extends Passenger, Customer{
	
}*/

class Main {
	public static void main(String[] args) {
		Customer customer = new Customer();
		Passenger passenger = new Passenger();
		customer.id = 1001;
		customer.name = "ram kumar";
		customer.cost = 789;

		passenger.id = 1005;
		passenger.name = "suresh kumar";
		passenger.location = "madurai";

		customer.info();
		passenger.info();
	}

}