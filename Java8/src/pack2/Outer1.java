package pack2;

public class Outer1 {

	int x=90;
	int y=3;
	
	static class Calculation{
      static int multiplication(Outer1 o) {
    	  return o.x+o.y;
      }
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(Outer1.Calculation.multiplication(new Outer1()));
	}
}
