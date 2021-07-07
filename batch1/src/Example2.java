
public class Example2 {
public static void main(String[] args) {
	
	byte b1=127;
	//byte b2=128;// error out of range 
	
	System.out.println(Byte.MAX_VALUE);//127
	System.out.println(Byte.MIN_VALUE);//-128
	
	short s1=776;
	//s1=33333;
	
	
	System.out.println(Short.MAX_VALUE);//32767
	System.out.println(Short.MIN_VALUE);//-32768

	int p1=667878;
//	p1=87878787878; // error 
	  
	System.out.println(Integer.MAX_VALUE);//2147483647
	System.out.println(Integer.MIN_VALUE);//-2147483648

long l1=8788877887L;

// by default all integer  literal is int 

	
}
}
