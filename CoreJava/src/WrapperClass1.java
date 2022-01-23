
public class WrapperClass1 {

	public static void main(String[] args) {
		int x=10;
		
		Integer k1=new Integer(x); // boxing -- primitive to wrapper class 
		
		int y=k1.intValue(); // unboxing 
		
		Integer s1=new Integer(100);
		  // with object no arithmetic operation will work 
		
		int p=s1.intValue();
		p++;
		 s1=new Integer(p);
		
	}
}
