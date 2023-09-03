
public class Casting {

	public static void main(String[] args) {
		float f1=878788.545f;
		double d1=f1;  // implicit casting .. widening 
		int x=988989;
		f1=x;//
		
		long p1=77667767788778L;
		
		int k=(int) p1;  // explicit casting .. narrowing 
		System.out.println(p1);
		System.out.println(k);
	}
}
