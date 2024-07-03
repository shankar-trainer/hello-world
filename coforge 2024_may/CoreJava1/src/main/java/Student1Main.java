
public class Student1Main {

	public static void main(String[] args) {

		Student1 student1 = null;
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("Enter Student's Id:");
		int id = scanner.nextInt();

		System.out.println("Enter Student's Name");
		String name = scanner.next();

		System.out.println("Enter Student's address");
		String address = scanner.next();

		String ch = null;
		do {
			System.out.println("Whether the student is from NIT(Yes/No):");
			ch = scanner.next();
			if(ch.equalsIgnoreCase("Yes") || ch.equalsIgnoreCase("No"))
				break;
		} while (!ch.equalsIgnoreCase("Yes") || !ch.equalsIgnoreCase("No"));
		

		if (ch.equalsIgnoreCase("Yes"))
			student1 = new Student1(id, name, address);
		if (ch.equalsIgnoreCase("No")) {
			System.out.println("Enter the college name");
			String collegename = scanner.next();
			student1 = new Student1(id, name, address, collegename);
		}

		System.out.println("Student id :" + student1.getStudentId());
		System.out.println("Student Name :" + student1.getStudentName());
		System.out.println("Address :" + student1.getStudentAddress());
		System.out.println("College Name :" + student1.getCollegeName());

	}
}
