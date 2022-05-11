public class Student {

	int roll;// instance variable -- instance/object have one copy of attribute 
	String name;
	String subject;
	
	
	public static void main(String[] args) {
		Student student1=new Student();
		//all objects are having 1 copy of all attributes and methods
		System.out.println(student1.roll);
		System.out.println(student1.name);
		System.out.println(student1.subject);
		
		// all instance variable are by default 0 and null
		Student student2=new Student();
		student2.roll=878877;
		student2.name="arvind kumar";
		student2.subject="math";
		
		System.out.println(student2.roll);
		System.out.println(student2.name);
		System.out.println(student2.subject);
		
		
	}
}
