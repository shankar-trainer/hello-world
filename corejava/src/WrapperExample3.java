
public class WrapperExample3 {

	public static void main(String[] args) {
		Integer x=new Integer(123);
		Integer y=new Integer("5787");
		
		Float f1=new Float(566776.7676);
		Float f2=new Float(566776.7676f);
		Float f3=new Float("566776.7676");
		//parseXXX("String")-- parse and covert string into primitive  data type
		
		String a="678";
		int p = Integer.parseInt(a);
		
		System.out.println(p+10);
		System.out.println(a+10);
		 //Float.parseFloat("");
		 //Double.parseDouble("");
		 
	}
}
