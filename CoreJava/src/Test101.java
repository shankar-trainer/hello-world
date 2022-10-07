
public class Test101 {

	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer();
		
		StringBuilder builder=new StringBuilder(buffer);
		
		String s="hello";
		String s1="hello";
		String s2="hello";
		String s3="hello";
		String s4="hello";
		// 1 object 5 refer variable 
		
		String s5="hello1";
		s5="4545";
		
		
		s.concat("world");
		s.replaceAll("hello", "greeting");
		
		System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		
		String var1="abc"; // string pool  obj1
		String var2="abc";  //string pool  obj1
		String var3=new String("abc");  // outside string pool -- obj2 
		
		
		// .equals , ==
		
		System.out.println(var1==var2);     // ==  check referrences 
		System.out.println(var1.equals(var2));
		System.out.println(var2.equals(var3));
		System.out.println(var1.equals(var3));
		
		System.out.println(var1==var3);
		
		
		
	}
}
