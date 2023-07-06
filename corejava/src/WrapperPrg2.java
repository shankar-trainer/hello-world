
public class WrapperPrg2 {

	public static void main(String[] args) {
		
		// autoboxing = boxing+unboxing 
		
		Integer x=10;
		x++;    // wrapper class to primitive, primitive to wrapper   
		
		
		String s1="123";

		int p1=Integer.parseInt(s1);
		System.out.println(p1);
		
		float f1 = Float.parseFloat("123.34");// parse String and convert to primitive
		
		System.out.println(p1);
		System.out.println(f1);
		
	}
}
