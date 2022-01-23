
public class SbExample1 {

	public static void main(String[] args) {
		String s1="hello";
		String s2="world";
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s3);
		
		//StringBuffer stringBuffer="hello"; // no string literal is accepted
		StringBuffer stringBuffer=new StringBuffer("hello");
		
		System.out.println(stringBuffer);
		stringBuffer.append(" world "); // StringBuffer is mutable (modifiable)
		System.out.println(stringBuffer);
		
		System.out.println(stringBuffer.delete(1, 5));
		System.out.println(new StringBuffer("hello i am fine ").delete(1, 5));
		
		System.out.println(stringBuffer.reverse());
		System.out.println(stringBuffer.insert(5, "welcome to java"));
		
	}
}
