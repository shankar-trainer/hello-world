import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Student's Id:");
		int id = scanner.nextInt();

		System.out.println("Enter Student's Name:");
		String name = scanner.next();

		System.out.println("Enter Student's Address:");
		String address = scanner.next();

		Student student = null;

		String college = null;
		boolean flag = true;
		while (flag) {
			System.out.println("Whether Student is from NIT (Yes/No)");
			String response1 = scanner.next();

			if (response1.equals("Yes") || response1.equals("No")) {
				if (response1.equals("Yes")) {
					flag = false;
					student = new Student(id, name, address);
				} else {
					System.out.println("Enter college Name");
					college = scanner.next();
					flag = false;
					student = new Student(id, name, address, college);
				}
			}
		}
		System.out.println("Student id:" + student.getStudentId());
		System.out.println("Student name:" + student.getStudentName());
		System.out.println("Address:" + student.getStudentAddress());
		System.out.println("College Name:" + student.getCollegeName());
	}
}
