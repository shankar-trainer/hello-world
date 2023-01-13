import com.audintel.model.Student;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.setRoll(66556);
		student.setName("amit srivastava");
		student.setSubject("Math");
		
		System.out.println("student details ");
		System.out.println("roll is "+student.getRoll());
		System.out.println("name is "+student.getName());
		System.out.println("subject is "+student.getSubject());
		
	}
}
