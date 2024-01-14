
public class WrapperClass {

	public static void main(String[] args) {
		
		Integer x=new Integer(10001);  // boxing primitive to wrapper
		    //
		int y=x.intValue(); // unboxing --> wrapper to primitive
		
		y++;
		
		x=new Integer(y);
		
		// autoboxing -- implicitly boxing and unboxing
		
  Integer p=8000;  // boxing 
  p++;             // unboxing , boxing   
		
  
  
		
		
		
		
		
		
	}
}
