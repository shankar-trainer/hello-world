import java.io.Console;

public class OverloadingExample {

	public static void addition(int a, int b){
		System.out.println("addition  is "+(a+b));
	}

	public static void addition(float a, float b){
		System.out.println("addition  is "+(a+b));
	}
	
	public static void addition(String  a, String b){
		System.out.println("name  is "+(a+b));
	}
	
	public static void addition(int a, int b, int c){
		System.out.println("addition  is "+(a+b+c));
	}

    public static void main(String args[]){
	 addition(1,2); 
	 addition(1,2,3); 
	 addition(11.2f,22.2f); 
	 addition("surendra "," partap"); 
   }

}
