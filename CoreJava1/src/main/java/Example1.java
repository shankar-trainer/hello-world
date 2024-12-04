
public class Example1 {

	public static void main(String[] args) {

		byte b1 =127;
		
		//b1=128;
		
		byte b2=-128;
		//b2=-129;
		
		System.out.println("Byte max "+Byte.MAX_VALUE);// 127
		System.out.println("Byte min "+Byte.MIN_VALUE);//-128 
		
		//int k=66776767676;
	
		System.out.println("Integer max "+Integer.MAX_VALUE);// 2147483647
		System.out.println("Integer min "+Integer.MIN_VALUE);//-2147483648
	
		int k=2147483647;
		//k=2147483648; // error 
		
		long p1=455454545454L;
		
		
	}
}
