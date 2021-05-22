package corejava;

public class StringBF {

	public static void main(String[] args) {
		
		
		String s="hello";
		
//		s.concat(" world");
	s=	s.concat(" world");
		System.out.println(s);
		
		
		//StringBuffer buffer="hhhg";
	StringBuffer buffer=new StringBuffer("welcome");
	
	buffer.append(" to java ");
	
	System.out.println(buffer);
	
	
	buffer.insert(4, " hi  ");
	System.out.println(buffer);
	
	System.out.println(new StringBuffer("hello").reverse());
		
	
   StringBuffer delete = new StringBuffer("hello world").delete(2, 5);

   System.out.println(delete);
		
		
	}
}
