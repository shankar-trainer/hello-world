import java.util.Scanner;

public class Student1Main {

	public static void main(String[] args) {
		
		Student1 student1;
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Student id");
		int id=scanner.nextInt();
		
		System.out.println("Student Name");
		String name=scanner.next();
		
		System.out.println("Student Address");
		String address=scanner.next();
		
		System.out.println("Whether the student is from NIT(Yes/No):");
		String  status=scanner.next();
		System.out.println(status);
		
		while(!status.equals("Yes")&&  !status.equals("No")) {
			System.out.println("Wrong Input");
			System.out.println("Whether the student is from NIT(Yes/No):");
			status=scanner.next();
		} 
		if(status.equals("Yes")) {
			student1=new Student1(id, name, address);
		}
		else {
			System.out.println("Enter the college name:");
			String college=scanner.next();
			student1=new Student1(id, name, address,college);
		}
		
		System.out.println("Student id :"+student1.getStudentId());
		System.out.println("Student name :"+student1.getStudentName());
		System.out.println("Address :"+student1.getStudentAddress());
		System.out.println("College name  :"+student1.getCollegeName());
	}
}
