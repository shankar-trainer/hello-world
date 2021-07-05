
public class SBDemo {

	public static void main(String[] args) {
		String s="hello";
		System.out.println(s);
		s.concat( "world");
		System.out.println(s);
		
		
		//StringBuffer buffer="hello";
		StringBuffer buffer=new StringBuffer("hello");
		
		System.out.println(buffer);
		buffer.append(" world");
		
		System.out.println(buffer);
		
		buffer.insert(3, "  to the java ");
		
		System.out.println(buffer);
		buffer.delete(1, 4);
		System.out.println(buffer);
		
		StringBuffer buffer1=new StringBuffer("welcome");
		buffer1.reverse();
		System.out.println(buffer1);
		System.out.println(buffer1.length());
		System.out.println(buffer1.capacity());
		
		
		StringBuffer buffer2=new StringBuffer(10);
		System.out.println(buffer2.capacity());
		
		
		
		
	}
}
