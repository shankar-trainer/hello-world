public class Person1 {
  void info() {
	  System.out.println("i am person");
  }
}

class Passenger extends Person1{
	@Override 
	void info() {
		  System.out.println("i am passenger");
	  }	
}
class Father extends Person1{
	@Override 
	void info() {
		System.out.println("i am father");
	}	
}
class Clerk extends Person1{
	@Override 
	void info() {
		System.out.println("i am clerk");
	}	
}
