
public class StringBufferProgram2 {

	public static void main(String[] args) {
		StringBuffer sb1=new StringBuffer();
		
		System.out.println("capacity  " + sb1.capacity());
		System.out.println("length  " + sb1.length());

		sb1.append("hello world");
		sb1.append("hello");
		
		
		System.out.println("capacity  " + sb1.capacity());
		System.out.println("length  " + sb1.length());

		sb1.append("h");

		System.out.println("capacity  " + sb1.capacity());
		System.out.println("length  " + sb1.length());
		
		StringBuffer sb2=new StringBuffer("I am learning java");
		char ch[]=new char[20];
		
		sb2.getChars(0, 7, ch, 4);
		
		System.out.println(new String(ch));
		
		
	}
}
