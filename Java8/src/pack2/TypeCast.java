package pack2;

public class TypeCast {

	public static void main(String[] args) {
		

		System.out.println("max and min for int ");
		System.out.println(Integer.MAX_VALUE);//2147483647
		System.out.println(Integer.MIN_VALUE);//-2147483648

		
		int x=2147483644;
		int x1=2147483647;
		//int x2=2147483648;// error 
		  // integer literal is by default int 
		long  l1=2147483648L;
		
		System.out.println("max and min for byte  ");
		System.out.println(Byte.MAX_VALUE);//127
		System.out.println(Byte.MIN_VALUE);//-128

		byte b1=127;
		//byte b2=128;
		
        int k=b1;  // implicit casting -- lower range value to higher range value
        int p=9877;
        byte b3=(byte) p;  // -107 // explicit casting 
        
        System.out.println(b3);
        
        
		
		
	}
}
