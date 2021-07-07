
public class SBDemo {

	public static void main(String[] args) {
		
	//	StringBuffer buffer="hello";// error 
		
		StringBuffer buffer=new StringBuffer("hello");
		System.out.println(buffer);
		
		buffer.append(" world ");
		System.out.println(buffer);
		
		buffer.delete(2, 6);
		System.out.println(buffer);
		
		buffer.reverse();
		
		System.out.println(buffer);
		
	}
}
