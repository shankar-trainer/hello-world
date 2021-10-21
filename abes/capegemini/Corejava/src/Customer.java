public class Customer {
	int id;
	String name;
	float salary;
	String state;
	String country;

	public Customer() {
		this(1001);
		//id = 1001;
		name = "mohan kumar";
		salary = 23000;
		System.out.println("default constructor called ");
	}

	public Customer(int id) {
		this.id = id;
		this.state = "UP";
		this.country = "India";
	}

	public Customer(int id, String name, float salary) {
		this(id);
		this.name = name;
		this.salary = salary;
		System.out.println("overloaded constructor ");

	}

	void customerInfo() {
		System.out.println("\nCustomer Information ");
		System.out.println("id is " + id);
		System.out.println("name is " + name);
		System.out.println("salary is " + salary);
		System.out.println("state is " + state);
		System.out.println("country  is " + country);
	}

	public static void main(String[] args) {
		Customer person1 = new Customer();
		Customer person2 = new Customer(1008, "ramesh kumar", 67000);
		Customer person3 = new Customer(1004, "suresh kumar", 45678.56f);
		person1.customerInfo();
		person2.customerInfo();
		person3.customerInfo();

	}

}
