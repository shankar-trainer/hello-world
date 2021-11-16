
public class StringBufferProgram {

	public static void main(String[] args) {
		
		String s1="hello";
		s1.concat("world");
		System.out.println(s1);
		
		//StringBuffer buffer="hello";
		
		StringBuffer buffer=new StringBuffer("hello");
		buffer.append("to java");
		
		System.out.println(buffer);
		
		buffer.delete(2, 5);
		System.out.println(buffer);
		
		System.out.println(buffer.capacity());
		
		buffer.reverse();
		System.out.println(buffer);
		
		buffer.insert(3, " fine  ");
		
		System.out.println(buffer);
		System.out.println(buffer.capacity());
		
		char ar1[]=new char[20];
		
		buffer.getChars(3, 8, ar1, 0);
		System.out.println(ar1);
		
	}
}
