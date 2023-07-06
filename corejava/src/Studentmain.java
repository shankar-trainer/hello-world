import java.util.Scanner;

public class Studentmain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int id;
		String name, address, college = null, choice=null;

		System.out.println("Enter Student's Id:");
		id = scanner.nextInt();

		System.out.println("Enter Student's Name:");
		name = scanner.next();

		System.out.println("Enter Student's Address:");
		address = scanner.next();

		boolean flag = true;
		while (flag) {
			System.out.println("Whether the student is from NIT(Yes/No):");
			choice = scanner.next();

			if (choice.equals("Yes")) {
				flag=false;
			}
			else if (choice.equals("No")) {
				System.out.println("Enter the college name ");
				college = scanner.next();
				flag=false;
			}
			
		}

		Student1 student;
		if (choice.equals("Yes")) {
			student = new Student1(id, name, address);
		} else
			student = new Student1(id, name, address, college);

		System.out.println("Student id:"+student.getStudentId());
		System.out.println("Student name:"+student.getStudentName());
		System.out.println("Address:"+student.getStudentAddress());
		System.out.println("College name:"+student.getCollegeName());
		scanner.close();
	}
}
