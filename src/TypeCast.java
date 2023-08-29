
public class TypeCast {

	public static void main(String[] args) {
		
		//
		
		int x=1000;
		float p1=x;  // implicit casting, widening 
		
		byte b1=(byte) x;//  explicit casting , narrowing 
		
		System.out.println(x);
		System.out.println(p1);
		System.out.println(b1);
		
	}
}
