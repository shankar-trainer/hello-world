public class Student {

	private int rollno;
	private String name;
	private String subject;

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.rollno=1001;
		s1.name="ram kumar";
		
		s2.rollno=1002;
		s2.name="mohan kumar";
		
		System.out.println("student1 information");
		System.out.println("\t roll no is "+s1.rollno);
		System.out.println("\t name is "+s1.name);
		
		System.out.println("student2 information");
		System.out.println("\t roll no is "+s2.rollno);
		System.out.println("\t name is "+s2.name);

	}

}
