
public class WrapperDemo1 {

	public static void main(String[] args) {
		int k=100;
		Integer x1=new Integer(k);// boxing -- primitive to wrapper class 
		
		int p1=x1.intValue();  // unboxing -- wrapper to primitive
		
		p1++;
		
		x1=new Integer(p1);
		System.out.println(p1);
		
		
		Float f1=878787.67f;//  primitive float to Float class  // boxing  
		f1++;  // object to primitive -- unboxing 
		// boxing +unboxing= autoboxing 

		
		Integer p2=new Integer(877887);
		Integer p3=new Integer("1");
		
		System.out.println(p2+p3);
		
		 
		 
		 
		
		
	}
}
