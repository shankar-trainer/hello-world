
public class TypeCast1 {

	public static void main(String[] args) {
		// reference cast -- inheritance 
		// Float is a number 
		// Number is float
		
		Number n1=88787;
		Float f1=9009.0f;
		//Float f1=(Float) n1; // class cast exception
		
		n1=f1;
		System.out.println(f1);
		System.out.println(n1);
		
		Integer i=909;
		//i=f1; // error
		// f1=i; // error 
	}
}
