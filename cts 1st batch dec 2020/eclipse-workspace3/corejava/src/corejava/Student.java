package corejava;

public class Student {

	private int roll;     // attributes  instance variable 
	private String name;  
	private String subject;
	    // instance method 
	 void study() {
		 System.out.println("student will study ");
	 }
	 
	
	
	public static void main(String[] args) {
	
		Student s1=new Student();// s1  is object or instance of the student class
		
		s1.roll=1001;
		s1.name="mohan kumar";
		s1.subject="math";
		
		System.out.println(s1.roll);
		System.out.println(s1.name);
		System.out.println(s1.subject);
		
		s1.study();
		
	}
}
