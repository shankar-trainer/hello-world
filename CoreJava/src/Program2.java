public class Program2 {

	public static void main(String[] args) {
		
		int x=1000;
		
		System.out.println(x);
		float p=x; // implicit casting
		             // widening
		System.out.println(p);
		
		double d1=877887.767676;
		int p1=(int) d1;  // explicit casting
		                  //narrowing 
		
		System.out.println(d1);
		System.out.println(p1);
	}
}
