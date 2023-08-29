
public class WrapperPrg1 {

	public static void main(String[] args) {
		
		int x=100;
		Integer p1=new Integer(x); // boxing 
		
		int intValue = p1.intValue();// un boxing 
		
		intValue++;
		intValue++;
		
		p1=new Integer(x);// unboxing 
		
		
	}
}
