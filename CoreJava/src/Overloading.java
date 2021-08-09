
public class Overloading {
    static void addition(int a, int b) {
    	System.out.println("addition is  "+(a+b));
    }
    
    static void addition(int a, int b, int c) {
    	System.out.println("addition is  "+(a+b+c));
    }
	
    static void addition(float a, float b) {
    	System.out.println("addition is  "+(a+b));
    }
    
    static void addition(String a, String  b) {
    	System.out.println("full name  is  "+(a+b));
    }
    
    
	public static void main(String[] args) {
		addition(12, 45);
		addition(1, 2,3);
		addition(3.4f,4.4f);
		addition("mohan" , "  sharma");
	}
}
