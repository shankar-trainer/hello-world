
public class WrapperClass {

	public static void main(String[] args) {
		int x=100;
		
		Integer p1=new Integer(x); // boxing -- primitive to wrapper 
		
		int k=p1.intValue();// unboxing  wrapper to primitive
		
		k++;
		p1=new Integer(k);
		
		System.out.println(p1);
		System.out.println(p1.intValue());
		
		// auto boxing = boxing +un boxing 
		
		Integer s1=1001;  // boxing 
		s1++; // unboxing , boxing
	}
}
