
public class DataType {

	public static void main(String[] args) {
		byte b1=100;
		byte b2=127;
		//b2=128;
		b2=-127;
		b2=-128;
		//b2=-129;
		
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128
		
		
		System.out.println(Short.MAX_VALUE);//32767
		System.out.println(Short.MIN_VALUE);//-32768
		
		short t1=32767;
		//t1=32768;
		
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648
		
		int i=2147483647;
		//i=2147483648;
		
		long k=2147483648L;  // int is default value
		
		double d1=76776.7887;
		float f1=7776.455F;
		
		float radius=45.67f;
		
		float area=3.14F*radius*radius;
		
		
	}
}
