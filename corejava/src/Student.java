
public class Student {
  int roll;
  String name;
  
  void studentInfo() {
	  System.out.println("\nStudent Information \n");
	  System.out.println("\troll is "+roll);
	  System.out.println("\tname is "+name);
  }
  public static void main(String[] args) {
	
	  Student student=new Student();
	  //1.object (new Student())  in heap
	  //2.student reference variable
	  //object is returned to the reference variable student
	  
	  System.out.println("\troll "+student.roll);
	  System.out.println("\tname "+student.name);
	  
	  student.roll=98998;
	  student.name="suresh kumar";
	  
	  System.out.println("\troll "+student.roll);
	  System.out.println("\tname "+student.name);
	  
	  student.studentInfo();
}
}
