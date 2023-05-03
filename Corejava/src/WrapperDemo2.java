
public class WrapperDemo2 {

	public static void main(String[] args) {
		Integer x=new Integer(1000); 
		// constructor accepts int and string both
		Integer x1=new Integer("1200");
		
		Float f1=new Float(676776.66);
		Float f2=new Float("676776.66");

		   // autoboxing 
	Integer p1=1000;  // boxing 
	System.out.println(p1);
	
	p1++;      // unboxing 
	
	System.out.println(p1);
	System.out.println(f2+677.67);
	
	Integer p2=null;
		
		
		
	}
}
