
public class Overloading {

	 public static void addition(int a, int b) {
		 System.out.println(a+b);
	 }
	 public static void addition(int a, int b,int c) {
		 System.out.println(a+b+c);
	 }
	 
	 public static void addition(long a, int b) {
		 System.out.println(a+b);
	 }
	 public static void addition(String  a, String b) {
		 System.out.println(a+b);
	 }
	 public static void addition(float a, int b) {
		 System.out.println(a+b);
	 }
	 
	 public static void main(String[] args) {
		addition(34.5f,12);
		addition(34,12);
		addition("akash","kumar");
		addition(1,2,3);
		addition(1l,2);
		
	}
}
