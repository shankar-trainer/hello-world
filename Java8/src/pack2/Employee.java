package pack2;

public class Employee {
	int id;
	String name;
	float salary;
}

class Manager extends Employee {
	String location;
	String mobile;

	Manager() {
		id = 988998;
		name = "rohit sharma";
		salary = 90000;

		location = "chennai";
		mobile = "samsung galaxy";
	}
}

class SalesPerson extends Employee {
	String city;
	String bike;

	SalesPerson() {
		id = 988991;
		name = "mohit sharma";
		salary = 10000;
		city = "delhi";
		bike = "tvs";
	}
}

class EmployeeMain {

	public static void main(String[] args) {
		Manager manager = new Manager();
		SalesPerson sperson = new SalesPerson();

		System.out.println("\nManager Record \n");
		System.out.println("Id is  " + manager.id);
		System.out.println("Name is  " + manager.id);
		System.out.println("Salary is  " + manager.id);
		System.out.println("Location is  " + manager.location);
		System.out.println("Mobile is  " + manager.mobile);

		System.out.println("\nSalesPerson  Record \n");
		System.out.println("Id is  " + sperson.id);
		System.out.println("Name is  " + sperson.id);
		System.out.println("Salary is  " + sperson.id);
		System.out.println("Bike is  " + sperson.bike);
		System.out.println("Salary is  " + sperson.city);

	}

}