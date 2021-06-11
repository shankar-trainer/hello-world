
public class Test1 {

	public static void main(String[] args) {
		//System.out.println(10/0);
		//java.lang.ArithmeticException: / by zero
		
		System.out.println(10.0/0);//Infinity
		System.out.println(-10.0/0);//-Infinity

		System.out.println(0.0/0);//NaN
		
		int a=65656;
		int b=0b10001;
		int c=0xabc123;
		int d=0123;
		
		System.out.println(a);
		System.out.println(b);//17
		System.out.println(c);//11256099
		System.out.println(d);//83
	}
}
