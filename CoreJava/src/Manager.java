class WorkingDays {
	public static final int Sunday = 0;
	public static final int Monday = 1;
	public static final int Tuesday = 2;
	public static final int Wednesday = 3;
	public static final int Thursday = 4;
	public static final int Friday = 5;
	public static final int Saturday = 6;
}

public class Manager {

	private int id;
	private String name;
	private float salary;
	
	public Manager(int id,String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		}

	public static void main(String[] args) {
		
		Manager manager = new Manager(43443, "parmod sharma", 67000.00f);
		
		System.out.println("information  are ");
		System.out.println("id "+manager.id);
		System.out.println("name "+manager.name);
		System.out.println("salary "+manager.salary);
		System.out.println("working days "+WorkingDays.Monday);
	}
}
