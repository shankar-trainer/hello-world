
public class WrapperPrg3 {

	public static void main(String[] args) {
		
		int x=100;
		
		String string = Integer.toString(x);
		System.out.println(string);
		
		String binaryString = Integer.toBinaryString(x);
		String octalString = Integer.toOctalString(x);
		String hexString = Integer.toHexString(x);
		
		System.out.println(x);
		System.out.println(binaryString);
		System.out.println(octalString);
		System.out.println(hexString);
		
		Integer val1 = Integer.valueOf(123);
		Integer val2=	Integer.valueOf("123");
		
		//Integer p1=new Integer(1000);
		
		Integer p1=Integer.valueOf(1000);
		
	}
}
