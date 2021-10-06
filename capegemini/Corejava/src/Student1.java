public class Student1 {
	private int rollno;
	private String name;
	private String subject;

	void studentInfo() {
		System.out.println("student1 information");
		System.out.println("\t roll no is " + rollno);
		System.out.println("\t name is " + name);
		System.out.println("\t subject is " + subject);
	}

	public static void main(String[] args) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1();

		s1.rollno = 1001;
		s1.name = "ram kumar";
		s1.subject = "Mathematics";

		s2.rollno = 1002;
		s2.name = "mohan kumar";
		s2.subject = "English";

		s1.studentInfo();
		s2.studentInfo();
	}

}
