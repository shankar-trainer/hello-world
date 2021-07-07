
public class Student {

private	int roll;
private	String name;
private	String subject ;
	
	public static void main(String[] args) {
		Student student=new Student();
		
		System.out.println("student record ");
		System.out.println("roll is "+student.roll);
		System.out.println("name is "+student.name);
		System.out.println("subject  is "+student.subject);
		
		student.roll=1001;
		student.name="kamal kumar";
		student.subject="mathematics";
		
		System.out.println("student record ");
		System.out.println("roll is "+student.roll);
		System.out.println("name is "+student.name);
		System.out.println("subject  is "+student.subject);
		
	}
}
