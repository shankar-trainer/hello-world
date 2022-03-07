
public class Student {
	int roll;// instance variable   default access modifier 
private	String name;
	private float marks;
	
	void studentInfo() {// instance method 
		System.out.println("\nstudent information \n");
		System.out.println("roll no is "+roll);
		System.out.println("name  is "+name);
		System.out.println("marks   is "+marks);
	}
	
	public static void main(String[] args) {
		// local variable 
	 Student s1=new Student();	//  s1 is having one copy of roll, name, subject 
	 Student s2=new Student();	
	 Student s3=new Student();	
	
	s1.roll=1002;
	s1.name="sumit kumar";
	s1.marks=78.77f;
	
	s2.roll=1002;
	s2.name="ammit kumar";
	s2.marks=89.77f;
	
	s3.roll=1003;
	s3.name="pravin kumar";
	s3.marks=48.77f;
	
	s1.studentInfo();
	s2.studentInfo();
	s3.studentInfo();
	}
}
