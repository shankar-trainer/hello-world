
public class Test5 {

	public static void main(String[] args) {

		System.out.println(Byte.MAX_VALUE);// 127
		System.out.println(Byte.MIN_VALUE);//-128
                                         		
		
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println(Short.MIN_VALUE);//-32768
									
		
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		System.out.println(Long.MAX_VALUE);//9223372036854775807
		System.out.println(Long.MIN_VALUE);//-9223372036854775808
		

		byte p1=127;
		//byte p2=128;  // error
		byte p3=-128;
		//byte p4=-129;//error
		
		short s1=123;
		short s2=32767;
		short s3=(short) 32768;
		System.out.println(s2);
		System.out.println(s3);



	}
}
