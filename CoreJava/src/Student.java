public class Student {
    int roll;
    String name;  
    String subject;
    
    void study() {
    	System.out.println("student is studying");
    }
    void assessment() {
    	System.out.println("student is giving assessment");
    }
    void playGame() {
    	System.out.println("student is playing ");
    }
    
    public static void main(String[] args) {
		
    	Student student1=new Student();
    	Student student2=new Student();
    	   // student1 -- reference varible 
    	    // new Student() -- create object , allocate memory,return  reference of the 
    	  //object to the student1 variable
    	student1.roll=1001;
    	student1.name="arvind kumar";
    	student1.subject="math";
    	
    	System.out.println(student1.roll);
    	System.out.println(student1.name);
    	System.out.println(student1.subject);
	
    	student1.study();
    	student1.assessment();
    	student1.playGame();
    	
    	System.out.println(student2.roll);
    	System.out.println(student2.name);
    	System.out.println(student2.subject);
	
    	
    }
    
	
}
