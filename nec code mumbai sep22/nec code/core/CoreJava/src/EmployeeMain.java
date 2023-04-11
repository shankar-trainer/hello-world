
public class EmployeeMain {

	public static void main(String[] args) {
		Phone phone1 = new Phone(65656565, 455454455);
		Address address = new Address(1001, "mumbai", "maharastra", 6566565, phone1);

		Employee emp1 = new Employee(456564, "surendra kumar", 56000, address);

		System.out.println("Employee Information");
		System.out.println("\t id is " + emp1.getId());
		System.out.println("\t name is " + emp1.getName());
		System.out.println("\t salary is " + emp1.getSalary());

		System.out.println("\nEmployee Address");

		Address address2 = emp1.getAddress();

		System.out.println("\t  id is " + address2.getAddressId());
		System.out.println("\t city is " + address2.getAddressCity());
		System.out.println("\t state is " + address2.getAddressState());
		System.out.println("\t pin is " + address2.getAddressPin());

		Phone phone = address2.getPhone();
		System.out.println("\nEmployee phone");

		System.out.println("\t Home Phone is " + phone.getHomePhone());
		System.out.println("\t Office  Phone is " + phone.getOfficePhone());

	}
}
