
public class StringExample {

	public static void main(String[] args) {
		String var1="hello world";//  string pool 
		String var2="hello world";//   var1, var2, var3, var4 create in string pool  
		String var3="hello world";// all will refer same object 
		String var4    ="hello world";// all are referring same object  
    //  above 4 reference variable but single object 
	
		String var5    =new String("hello world");
		     // becoz of new String it will be created outside the String Pool
		     // it will refer new object 
	
		 // ==  it checks references 
		System.out.println(var1==var2);//true
		System.out.println(var1==var3);//true
		System.out.println(var1==var4);//true
		System.out.println(var1==var5);// false
	
		// equals -- check the content
		
	
		System.out.println(var1.equals(var5));// true
		
		
	}
	
}
