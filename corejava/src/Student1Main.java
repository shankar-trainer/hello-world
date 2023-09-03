import java.util.Scanner;

public class Student1Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student1 student1=null;

		System.out.println("Enter Student's Id: ");
		int id = sc.nextInt();

		System.out.println("Enter Student's Name: ");
		String nm = sc.next();

		System.out.println("Enter Student's Address: ");
		String addr = sc.next();

		boolean flag = true;
		while (flag) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			String option = sc.next();
			if (option.equals("Yes")) {
				student1 = new Student1(id, nm, addr);
				flag=false;
			} else if (option.equals("No")) {
				System.out.println("Enter the college name:	");
				String college = sc.next();
				student1 = new Student1(id, nm, addr, college);
				flag=false;
			} else {
				System.out.println("Wrong Input");
			}
		}
		System.out.println("Student id:"+student1.getStudentId());
		System.out.println("Student name :"+student1.getStudentName());
		System.out.println("Address :"+student1.getStudentAddress());
		System.out.println("College name :"+student1.getCollegeName());
		sc.close();
	}
}
