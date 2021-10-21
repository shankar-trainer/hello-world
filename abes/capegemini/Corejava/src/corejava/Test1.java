package corejava;

public class Test1 {

	public static void main(String[] args) {
		
		byte b1=127;
		
		//byte b2=128;
		
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);// -128
		
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println(Short.MIN_VALUE);// -32768
		
		short t1=32767;
		short t2=(short) 32768;
		
		System.out.println(t2);
		
		
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);// -2147483648
		int p1=2147483647;
		
		long l1=2147483649l;
		
	}
}
