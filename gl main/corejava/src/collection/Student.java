package collection;

public class Student {

	private int roll;
	private String name;
	private float marks;
	
	public Student(int roll, String name, float marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public float getMarks() {
		return marks;
	}
}
