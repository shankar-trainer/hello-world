
public class Manager {
	private int id;
	private String name;
	private float salary;
	private static String country ;// static or class variable
	private static String company= "capgemini"; // static or class variable

	public Manager() {
		id = 10001;
		name = "bharat bhushan";
		salary = 67000;
		// constructor is used to initialize the instance variable
		System.out.println("constructor called ");
	}

	static {
		country = "India";
		// static block is used to initialize the static variable
		System.out.println("static block ");
	}

	public static void main(String[] args) {
       Manager manager=new Manager();
       System.out.println("id is "+manager.id);
       System.out.println("name is "+manager.name);
       System.out.println("salary is "+manager.salary);
       System.out.println("country name is "+country);
       System.out.println("company  name is "+company);
	}
}
