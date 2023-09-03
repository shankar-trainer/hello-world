
public class Inspector {

	 int id;
	 String name;
	 float salary;

	static String state, country;// class variable

	// constructor is used for initialization of instance variable
	public Inspector() {
		this.id=989889;
		this.name="suresh kumar";
		this.salary=90000;
		
		System.out.println("constructor called");
	}

	// static block is used for initialization of class variable
	static {
		state = "UP";
		country = "India";
		System.out.println("static block called ");
	}

	// inside instance method instance, static variable can be called directly
	void inspectorInfo() {
		System.out.println("inspector data ");
		System.out.println("\tId  :" + id);
		System.out.println("\tname " + name);
		System.out.println("\tsalary " + salary);
		System.out.println("\tstate " + state);
		System.out.println("\tcountry " + country);
	}

	// inside ststic method static members can be called directly or with class name
	public static void main(String[] args) {
		Inspector inspector = new Inspector();

		System.out.println(" id  " + inspector.id);
		System.out.println("state " + state);
		System.out.println("country  " + country);

		inspector.inspectorInfo();
		
	}
}
