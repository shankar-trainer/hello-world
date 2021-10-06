package corejava;

public class StringDemo2 {
public static void main(String[] args) {
	
	String var1="abc";
	String var2="abc";
	// var1 and var2 refer same object in string pool
	
	String var3=new String("abc");
	
	//var3 will create separate object outside string pool
	//var3 refer different object
	
	// ==   checks reference
	// equals  checks contents 
	
	if(var1==var2)
		System.out.println("var1 == var2");
	
	if(var1.equals(var2))
		System.out.println("var1 equals  var2");

	if(var1==var3)
		System.out.println("var1 == var3");
	
	if(var1.equals(var3))
		System.out.println("var1 equals  var3");
	
	
	if("delhi"== new String("delhi"))
		System.out.println(" will not work");
	
	if("delhi".equals(new String("delhi")))
		System.out.println(" will  work");
	
	if("delhi"=="delhi")
		System.out.println(" will  work 2 ");
}
}
