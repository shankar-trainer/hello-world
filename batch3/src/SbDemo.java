
public class SbDemo {
public static void main(String[] args) {
	
	String s1="welcome";
	System.out.println(s1);
	s1.concat( "to java ");
	System.out.println(s1);
	
//	StringBuffer buffer="hello";
	StringBuffer buffer=new StringBuffer("hello");
	System.out.println(buffer);
	
	buffer.append(" world");
	
	System.out.println(buffer);
	
	buffer.insert(3, " greeting ");
	
	System.out.println(buffer);
	
	buffer.delete(3, 7);
	System.out.println("after delete "+buffer);
	buffer.reverse();
	
	System.out.println(buffer);
	
}
}
