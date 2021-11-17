
public class Factorial {

	static void method1(int n) {
	   int fact=1,counter=1;
		 while(counter<=n) {
			 fact=fact*counter++;
			 //counter++;
		 }
		 System.out.println("factorial is "+fact);
	}
	
	static void method2(int n) {
		int fact=1,counter=n;
		
		while(counter>=1) {
			fact=fact*counter--;
			//counter--;
		}
		System.out.println("factoial2 is "+fact);
	}
	
	public static void main(String[] args) {
		method1(5);
		method1(6);
	}
}
