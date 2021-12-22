
public class PrimitiveCasting {

	public static void main(String[] args) {
		
		//byte , short, integer , long, float , double 
		
		byte b1=127;
		
		short s1=b1;// implicit 
		
		System.out.println(s1);
		
		short s2=2345;
		
		byte b2=(byte) s2;// explicit ,  use cast operator, narrowing
		System.out.println(b2);
		
		int k=787676;
		float m1= k;// implicit  ,  no cast operator , widening
		
		float s5=676776677766776.567f;
		int i5=(int) s5;// explicit casting , use cast operator , narrowing
		System.out.println(i5);
		
		
		
	}
}
