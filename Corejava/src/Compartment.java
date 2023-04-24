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
	 compartment[3]=new FirstClass();
	 compartment[4]=new LauggageClass();
	 compartment[5]=new LadiesClass();
	 compartment[6]=new LauggageClass();
	 compartment[8]=new LauggageClass();
	 compartment[7]=new FirstClass();
	 compartment[9]=new LauggageClass();
	 
	 
	for(Compartment c:compartment) {
		c.notice();
	} 
	
}	
	
}