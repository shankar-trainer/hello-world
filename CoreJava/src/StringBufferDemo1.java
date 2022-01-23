
public class StringBufferDemo1 {

	public static void main(String[] args) {
		String s1="hello"; 
		String s2="world";
		
		s1.concat(s2);
		System.out.println(s1);
		
		//StringBuffer sb="hello";
		StringBuffer sb=new StringBuffer("hello");
	
		System.out.println(sb);
		sb.append(" world");
		System.out.println(sb);
		System.out.println(sb.reverse());
		System.out.println(sb.delete(3, 8));
		System.out.println(sb.insert(2, "i m fine"));
		
	}
	
}
