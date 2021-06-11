
public class WrapperDemo1 {

	public static void main(String[] args) {
		
		
		Integer x1=new Integer(1001);// boxing -- primitive to wrapper class
		
		int intValue = x1.intValue();// unboxing  -- wrapper to primitive 
		
		intValue++;
		intValue++;
		intValue++;
		x1=new Integer(intValue);
		System.out.println(x1);
		
		// autoboxing 
		
		
		Integer y=new Integer(200);
		y++;// boxing , unboxing --- autoboxing 
		
		Integer s=8999;
		s++;
		int d=s;
		
		
		
	}
}
