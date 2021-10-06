package corejava;

public class School {

	int regno;
	String name;
	public School(int regno, String name) {
		
		this.regno = regno;
		this.name = name;
	}

	/*public School() {
		// TODO Auto-generated constructor stub
	}*/
	
}

class HighSchool extends School{
	
	public HighSchool(int regno, String name) {
		//super();
		super(regno, name);
	}

	public static void main(String[] args) {
		new HighSchool(1111, "r k school");
	}
}

