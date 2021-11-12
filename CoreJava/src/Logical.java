
public class Logical {

	public static void main(String[] args) {
		
		int x=10;
		
		if(x++>6 && x++<100)
			System.out.println(x);
		
		if(x++>60 && x++<100)
			System.out.println(x);
		
		
		System.out.println(x);
		
		int y=10;
		
		if(y++>60 & y++<100)
			System.out.println(x);
		
		
		System.out.println("y is "+y);
	}
}
