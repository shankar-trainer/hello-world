
public class Porgram5 {

	public static void main(String[] args) {
		System.out.println(1.0/0);//Infinity

		System.out.println(-1.0/0);//-Infinity

		// Infinity is defined in double not in integer 
		
       //System.out.println(1/0);//java.lang.ArithmeticException
       
		System.out.println(0.0/0.0);//NaN
		
		System.out.println(0/0);//NaN  //java.lang.ArithmeticException: / by zero

		
	}
}
