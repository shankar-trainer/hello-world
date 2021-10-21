
public class Calculator {
	static String country;
	static String college;
	private static double pow;
	
	static{
		country="india";
		college="abes";
	}
	static void info(){
		System.out.println("college is "+college);
		System.out.println("country is "+country);
	}
	static void addition(int a, int b){
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
	}
	public static void main(String[] args) {
		addition(22, 33);
		info();
	}
}
