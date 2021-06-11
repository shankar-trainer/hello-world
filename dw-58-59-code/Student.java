
public class Student {

private	int roll; // attribute
private	String name;

	void study(int hour) // behaviour
	{
		System.out.println("study duration " + hour);
	}

	void exam(int hour) {
		System.out.println("exam duration " + hour);
	}

	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student.roll);
		System.out.println(student.name);
		
		student.roll=989898;
		student.name="kundan kumar";
		
		System.out.println(student.roll);
		System.out.println(student.name);
		
		student.study(5);
		student.exam(6);
	}

}
