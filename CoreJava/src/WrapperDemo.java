
public class WrapperDemo {

	public static void main(String[] args) {
		int x=20;
		
		Integer p=new Integer(x);
		   // boxing   primitive -- Wrapper class 
	       // arithmetic operation over object 
		int z=p.intValue();
		    // unboxing 
		   // wrapper to primitive  
		
		 z++;
		 p=new Integer(z);
		 
	}
}
