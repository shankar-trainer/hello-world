
public class SeniorManager {

	enum WorkingDays{Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday};

	private int id;
	private String name;
	private float salary;
	private WorkingDays start_day;
	private WorkingDays end_day;
	
	public SeniorManager(int id, String name, float salary,WorkingDays start_day,WorkingDays end_day) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.start_day=start_day;
		this.end_day=end_day;
	}
	

	public static void main(String[] args) {
		SeniorManager manager=new SeniorManager(788787,"r kumar",78000,WorkingDays.Monday,WorkingDays.Friday);
		
		System.out.println("information  are ");
		System.out.println("id "+manager.id);
		System.out.println("name "+manager.name);
		System.out.println("salary "+manager.salary);
		System.out.println("working start day "+manager.start_day);
		System.out.println("working end day "+manager.end_day);

		System.out.println("\nall days\n");
		
		SeniorManager.WorkingDays[] values = WorkingDays.values();
		for (WorkingDays workingDays : values) {
		   System.out.println(workingDays);	
		}
	}
	
}
