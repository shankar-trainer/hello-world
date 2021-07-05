
public class WrapperDemo {

	
	public static void main(String[] args) {
		
		
		String s="6776";
		
		Integer x=new Integer(67876);
		Integer y=new Integer(s);
		
		System.out.println(y++);
		
		Integer p=null;
		
		int p1=Integer.parseInt(s);
		s="55454.67";
		
		float f1=Float.parseFloat(s);
		
		p1++;
		
	String s2=	Integer.toString(p1);
	
	System.out.println(Integer.toString(p1));	
	System.out.println(Integer.toBinaryString(p1));	
	System.out.println(Integer.toHexString(p1));	
	System.out.println(Integer.toOctalString(p1));	
	
	}
}
