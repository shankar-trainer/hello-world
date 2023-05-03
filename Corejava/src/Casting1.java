
public class Casting1 {

	public static void main(String[] args) {
		
		Number n;
		
		Float f=989898.77878f;
		Integer x=77667;
		//f=x;   // cannot cast 
		n=f;
		f=(Float) n;
		System.out.println(n);
		System.out.println(f);
	}
}
