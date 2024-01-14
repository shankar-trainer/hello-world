
public class StringBufferPrg1 {

	public static void main(String[] args) {

		//StringBuffer buffer = "hello";

		// StringBuffer does not work with String literal
		// StringBuffer is mutable
		// it has insert, delete, reverse extra method

		StringBuffer buffer2 = new StringBuffer("hello");
		System.out.println(buffer2);
		
		buffer2.append(" world");
		System.out.println(buffer2);
		
		buffer2.delete(2, 8);
		System.out.println(buffer2);
		
		buffer2.insert(3, " angular ");
		System.out.println(buffer2);
		
		StringBuffer stringBuffer = new StringBuffer("hello world");
		
		System.out.println(stringBuffer);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
		

	}
}
