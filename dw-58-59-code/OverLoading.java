
public class OverLoading {

	static void  sum(int a, int b) {
		System.out.println("sum is "+(a+b));
	}
	static void  sum(float a, float b) {
		System.out.println("sum is "+(a+b));
	}
	static void  sum(int a, int b,int c) {
		System.out.println("sum is "+(a+b+c));
	}
	static void  sum(String a, String b) {
		System.out.println("full name is "+(a+b));
	}
	static void  sum(double a, int b) {
		System.out.println("sum is "+(a+b));
	}
	
	public static void main(String[] args) {
		sum(11,22);
		sum(11,22,33);
		sum(11.2f,22.3f);
		sum("ram "," kumar");
		sum(22.3,22);
	}
}
