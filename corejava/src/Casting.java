
public class Casting {

	public static void main(String[] args) {
		
		
		byte b1=56;
		
		System.out.println(b1);
		
		int p=b1;                // implicit casting, widening
		
		System.out.println(p);
		
		
		int k=565665;
		
		byte b2=(byte) k;      // explicit casting, narrowing 
		System.out.println(b2);
		
		float f1=5567566767f;
		
		int j=(int) f1;   // explicit casting, narrowing 
		System.out.println(j);
		
	}
}
