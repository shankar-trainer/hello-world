public class Student {

	int roll; // roll,name,subject are instance variable
	String name;
	String subject;

	 // instance method
	void study() {
		System.out.println("student is studying from 9 am  to 2 pm ");
	}

	public static void main(String[] args) {

		
		Student student1=new Student();
		                     // student1 reference variable 
		                     // 1 object, 1 reference variable
		                     //each object gets one copy of all attributes(instance variable), method
		student1.roll=10001;
		student1.name="amit kumar";
		student1.subject="math";
		
		System.out.println("student1 information");
		System.out.println("roll is "+student1.roll);
		System.out.println("name is "+student1.name);
		System.out.println("subject is "+student1.subject);
		
		student1.study();
	}
}
