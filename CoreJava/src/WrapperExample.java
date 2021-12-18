
public class WrapperExample {

	public static void main(String[] args) {
		int x=100;
		
		Integer y=new Integer(x);// boxing   primitive to wrapper 
		
		int p=y.intValue();
		p++;
		p++;
		
		y=new Integer(p);// unboxing  wrapper to primitive
		
		//Autoboxing 
		
		
		
	}
}
