package pack2;

public class Overloading {

	static void add(int a, int b) {
		System.out.println("sum of two int is "+(a+b));
	} 
	
	static void add(float a, float b) {
		System.out.println("sum of two deciaml  is "+(a+b));
		
	} 
	static void add(String a, String  b) {
		System.out.println("full name is "+(a+"  "+b));
	} 
	
	static void add(int a, int b, int c) {
		System.out.println("sum of three int is "+(a+b+c));
		
	} 
	public static void main(String[] args) {
		add(1,2);
		add(1.2f,2.5f);
		add(1,2,3);
		add("ram","krishna");
	}
}
