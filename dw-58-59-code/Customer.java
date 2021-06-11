
class Person{
	 int id;
}

public class Customer extends Person {
String location;
}

class RegularCustomer extends Customer{
	// multi level 
	
	public static void main(String[] args) {
		RegularCustomer customer=new RegularCustomer();
		System.out.println(customer.id);
		System.out.println(customer.location);
	}
}
