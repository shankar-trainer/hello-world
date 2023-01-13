
public class StringPool {

	public static void main(String[] args) {
		String var1="hello";
		String var2="hello";   // both var1 and var2 will refer same string object in string pool
	
		System.out.println(var1==var2);
		System.out.println(var1.equals(var2));
		
	
		String var3=new String("hello");
	
		System.out.println(var1==var3);//// both var1 and var3 will refer different object
		System.out.println(var1.equals(var3));
		
		
		System.out.println("mumbai"=="mumbai");
		System.out.println("mumbai"==new String("mumbai"));
		System.out.println("mumbai".equals(new String("mumbai")));
	
		
	}
}
