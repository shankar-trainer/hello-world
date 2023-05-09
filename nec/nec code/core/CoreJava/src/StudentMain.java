
public class StudentMain {

	public static void main(String[] args) {
		Student student1=new Student(1001,"ram kumar");
		Student student2=new Student(1001,"ram kumar");
		System.out.println(student1);
		System.out.println(student2);
		
		if(student2.equals(student1))
			System.out.println("equal");
		else
			System.out.println("not equal");
			
	}
}
