
public class WrapperPRg1 {

	public static void main(String[] args) {
		
		int p=100;
		Integer x=new Integer(p); // boxing primitive to wrapper class
		
		System.out.println(x);
		
		int i=x.intValue(); // unboxing  -- wrapper class to primitive
		i++;
		
		x=new Integer(i);
		
		System.out.println(x);
		
		// auto boxing 
		
		
		Integer k=100;   // autoboxing =boxing+unboxing 
		k++;
		
		
	}
}
