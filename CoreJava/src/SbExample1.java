
public class SbExample1 {

	public static void main(String[] args) {
		String s1="greeting";
		String s2=" to java";
		s1.concat(s2);
		System.out.println(s1);
		
		//StringBuffer sb="";// it will not accept String literal
		
		StringBuffer sb=new StringBuffer("learning");
		System.out.println(sb);
		sb.append(" java");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.delete(2, 5);
		System.out.println(sb);

		sb.insert(3, "hello ...");
		System.out.println(sb);
		
		
	}
}
