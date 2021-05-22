
class Manager extends Employee {
     private String location;
     private String country;

	public Manager(int id, String name, float salary) {
		super(id, name, salary);
		this.location = "chennai";
		this.country = "india";
	}

	public static void main(String[] args) {
		Manager manager = new Manager(1001, "mohan kumar", 20000);
	//Employee manager = new Manager(1001, "mohan kumar", 20000);
		System.out.println(manager.getId());
		System.out.println(manager.getName());
		System.out.println(manager.getSalary());
		
		System.out.println(manager.location);
		System.out.println(manager.country);
		System.out.println(getJobType());
		
		
	}
}
