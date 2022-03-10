
public class Person1 {
  void info() {
	  System.out.println("I am a person");
  }
}
 class Employee1 extends Person1 {
	
	@Override 
	void info() {
		System.out.println("I am a employee");
	}
}
 class Father  extends Person1{
	 @Override 
	 void info() {
		System.out.println("I am a father");
	}
}
class  Passenegr extends Person1{
	@Override 
	void info() {
		System.out.println("I am a passenegr");
	}
}
class Tourist extends Person1{
	@Override 
	void info() {
		System.out.println("I am a tourist");
	}
}


