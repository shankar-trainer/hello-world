
public class Student {

	private int roll;   // instance variable
	private  String name;
	private String subject;
	private float marks;
	
	void exam() // instance method
	{
		System.out.println(name+" will give exam");
	}
	
	void study() {
		System.out.println(name+" will study from 9 to 1");
	}
	
	public static void main(String[] args) {
     Student stud1=new Student();	// one copy of all attribute/method 	
	
     stud1.roll=9898989;
     stud1.name="suredra k";
     stud1.subject="math";
     stud1.marks=78.89f;
     
     System.out.println("roll of student1 is "+stud1.roll);
     System.out.println("name of student1 is "+stud1.name);
     System.out.println("subject of student1 is "+stud1.subject);
     System.out.println("marks of student1 is "+stud1.marks);
    
     stud1.exam();
     stud1.study();
	}
	
}
