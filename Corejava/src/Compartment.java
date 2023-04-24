public class Compartment {
  void notice() {
	  System.out.println("compartment class");
  }
}

class FirstClass extends Compartment{
	@Override
	void notice() {
	  System.out.println("First class ");
	}
}
class LadiesClass extends Compartment{
	@Override
	void notice() {
		System.out.println("Ladies  class ");
	}
}
class LauggageClass extends Compartment{
	@Override
	void notice() {
		System.out.println("Luggage  class ");
	}
}

class  ComparmentMain{
  public static void main(String[] args) {
	Compartment compartment[]=new Compartment[10];
	 compartment[0]=new FirstClass();
	 compartment[1]=new LadiesClass();
	 compartment[2]=new LauggageClass();
	 
	for(Compartment c:compartment) {
		c.notice();
	} 
	
}	
	
}