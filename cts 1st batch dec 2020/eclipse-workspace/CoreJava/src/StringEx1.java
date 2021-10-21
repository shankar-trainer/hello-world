
public class StringEx1 {

	public static void main(String[] args) {
		String var1="hello";  //--- create the object in string pool

		String var2=var1;     // var1, var2 refers same object in string pool


		String var3=new String("hello"); // create object oustide string pool


		System.out.println(var1==var2);
		System.out.println(var1==var3);// false
		
		System.out.println(var1.equals(var3));
		System.out.println(var2.equals(var3));
		
		
		
		
	}
}
