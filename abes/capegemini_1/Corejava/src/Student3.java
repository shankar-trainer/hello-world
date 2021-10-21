import java.util.Scanner;

public class Student3 {
	private int rollno;
	private String name;
	private String subject;

	void studentInfo() {
		System.out.println("student1 information");
		System.out.println("\t roll no is " + rollno);
		System.out.println("\t name is " + name);
		System.out.println("\t subject is " + subject);
	}
	
	Scanner scanner=new Scanner(System.in);
	
	void studentInput(){
		System.out.println("Enter roll number");
		rollno=scanner.nextInt();
		
		System.out.println("Enter name");
		scanner.nextLine();
		name=scanner.nextLine();
		
		System.out.println("Enter subject");
		subject=scanner.next();
	}

	public static void main(String[] args) {
		Student3 s1 = new Student3();
		Student3 s2 = new Student3();
		 
		s1.studentInput();
		s2.studentInput();
		
		s1.studentInfo();
		s2.studentInfo();
	}

}
