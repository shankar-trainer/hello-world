
public class WarppeerDemo1 {

	public static void main(String[] args) {
		int p =10;
		
		Integer x=new Integer(p);
		// boxing 
		
	 p=	x.intValue();// unboxing 
	
	 p++;
	
	 Integer s1=new Integer("123");
	 int y=s1.intValue();
	 y++;
	 
	 Float f1=new Float("5654.555f");
	 
	 System.out.println(f1);
	 
	 
	
		
		
	}
}
