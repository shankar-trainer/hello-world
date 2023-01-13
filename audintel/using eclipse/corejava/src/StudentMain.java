
public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRoll(56656);
		student.setName("sharat kumar");
		student.setSubject("science");
		student.setMarks(77.45f);
		
		System.out.println("student information");
		System.out.println("\troll no is "+student.getRoll());
		System.out.println("\tname no is "+student.getName());
		System.out.println("\tsubject no is "+student.getSubject());
		System.out.println("\tmarks no is "+student.getMarks());
		
		
	}
}
