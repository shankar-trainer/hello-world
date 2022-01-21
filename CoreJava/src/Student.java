
public class Student {

	int roll;   // instance variable 
	String name;
	String subject;
	
	public static void main(String[] args) {
		
		Student student1=new Student();// two instance/object student1, student2
		
		Student student2=new Student();
		
		student2.roll=99898;
		student2.name="madan kumar";
		
		student1.roll=99891;
		student1.name="amar kumar";
		
		System.out.println("student1 data ");
		System.out.println("roll is "+student1.roll);
		System.out.println("name is "+student1.name);
		 
		System.out.println("student2 data ");
		System.out.println("roll is "+student2.roll);
		System.out.println("name is "+student2.name);
	}
	
}
