
public class Primitive_Data_Casting {

	public static void main(String[] args) {
		
		byte b1=127;
		
		byte b2=(byte) 130;  // byte range 127 to -128 -- narrowing 
		   // explicit casting -- higher to lower 
		 
		System.out.println(b2);
		
		int x=10000;
		float f=x;// implicit casting -- lower to higher  -- widening
		
		
		
	}
}
