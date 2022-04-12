
public class Student {

	int roll;  //instance variable
	String name;
	float marks;

	public Student() {//default constructor
     System.out.println("constructor called ");	
     roll=98998;
     name="suresh kumar";
     marks=77.55f;
	}
	
	void study() {
		System.out.println("i am studying");
	}

	void exam() {
		System.out.println("i will appear in exam");
	}

	public static void main(String[] args) {
		Student student = new Student();
		Student student1 = new Student();
		Student student2 = new Student();

		System.out.println("student 1 data ");
		System.out.println("roll is "+student.roll);
		System.out.println("name is "+student.name);
		System.out.println("marks is "+student.marks);
		
		
		student1.roll=1001;
		student1.name="aman kumar";
		student1.marks=56.55f;
		
		student2.roll=1002;
		student2.name="suman kumar";
		student2.marks=59.55f;
		
		
		System.out.println("\nstudent 2 data ");
		System.out.println("roll is "+student1.roll);
		System.out.println("name is "+student1.name);
		System.out.println("marks is "+student1.marks);
		
		System.out.println("\nstudent 3 data ");
		System.out.println("roll is "+student2.roll);
		System.out.println("name is "+student2.name);
		System.out.println("marks is "+student2.marks);
		
		
	}
}
