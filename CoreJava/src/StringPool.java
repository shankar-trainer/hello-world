
public class StringPool {

	public static void main(String[] args) {
		String var1="hello";
		String var2="hello";// 2 reference variable single object 
		
		String var3=new String("hello");// create a new object in heap , total 3 reference variable 2 object
		
		if(var1==var2)
			System.out.println("== is true ");
		// ==  checks the reference 
		
		if(var1.equals(var2))
			System.out.println("var1.equals(var2)");
		
		
		if(var1==var3)
			System.out.println("var1==var3 is true ");// it will not work
		
		if(var1.equals(var3))// .equals checks the content 
			System.out.println("var1.equals(var3)");// it will work
		
		System.out.println("hello"=="hello");
		System.out.println("hello"==new String("hello"));
		
		System.out.println("hello".equals(new String("hello")));
		
	}
}
