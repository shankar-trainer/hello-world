package pack2;

public class Employee {
	int id;
	String name;
	float salary;

	void empInfo() {
		System.out.println("id is " + id);
		System.out.println("Name is  is " + name);
		System.out.println("salary  is " + salary);
	}
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

	@Override
	void empInfo() {
		System.out.println("\tid is " + id);
		System.out.println("\tName is  is " + name);
		System.out.println("\tsalary  is " + salary);
		System.out.println("\tgrosss salary  is " + (salary - salary * 0.05f));

		System.out.println("\tLocation is " + location);
		System.out.println("\tMobile  is " + mobile);
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
	@Override
	void empInfo() {
		System.out.println("id is " + id);
		System.out.println("Name is  is " + name);
		System.out.println("salary  is " + salary);
		System.out.println("grosss salary  is " + (salary - salary * 0.02f));

		System.out.println("City is " + city);
		System.out.println("Bike  is " + bike);
	}
}

class EmployeeMain {

	public static void main(String[] args) {
		Manager manager = new Manager();
		SalesPerson sperson = new SalesPerson();

		System.out.println("\nManager Record \n");
		/*
		 * System.out.println("Id is  " + manager.id); System.out.println("Name is  " +
		 * manager.id); System.out.println("Salary is  " + manager.id);
		 * System.out.println("Location is  " + manager.location);
		 * System.out.println("Mobile is  " + manager.mobile);
		 */
		manager.empInfo();

		System.out.println("\nSalesPerson  Record \n");
		sperson.empInfo();
		/*
		 * System.out.println("Id is  " + sperson.id); System.out.println("Name is  " +
		 * sperson.id); System.out.println("Salary is  " + sperson.id);
		 * System.out.println("Bike is  " + sperson.bike);
		 * System.out.println("Salary is  " + sperson.city);
		 */
	}

}