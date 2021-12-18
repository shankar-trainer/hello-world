
public class Passenger {

	private int id;
	private String  name;
	private int age;
	private Gender gender;
	
	public Passenger(int id, String name, int age, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	static void passenGerInfo(Passenger passenger){
		System.out.println("\nPassenger Information\n");
		System.out.println("Id is "+passenger.id);
		System.out.println("Name is "+passenger.name);
		System.out.println("Age is "+passenger.age);
		System.out.println("Gender is "+passenger.gender);
	}
	public static void main(String[] args) {
		Passenger passenger1=new Passenger(65656, "paramanad kuumar", 67,Gender.Male);
		Passenger passenger2=new Passenger(65651, "sumitra sharma", 45,Gender.Female);
	
		 Passenger.passenGerInfo(passenger1);
		 Passenger.passenGerInfo(passenger2);
	}
	
}
