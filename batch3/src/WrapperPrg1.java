
public class WrapperPrg1 {

	public static void main(String[] args) {
		
		int p=100;
		
		Integer x=new  Integer(p);// boxing -- primitive to wrapper 
		
		int y=x.intValue();// unboxing  -- wrapper to primitive
		y++;
		
		x=new Integer(y);
		System.out.println(x);
		
			//autoboxing 
		
		int k=100;
		Integer m=k;// boxing -- primitive to wrapper
		m++;   //  unboxing 
	        
	}
}
