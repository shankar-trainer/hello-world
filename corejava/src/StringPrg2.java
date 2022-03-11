class StringPrg2{
  public static void main(String args[]){
	  
	  String s1="cat";  // refers obj1 in string pool
	  String s2="cat";  // refers obj1 in string pool
	  
	  String s3=new String("cat");// refers obj2 outside string pool
	  
	  // ==  checks reference variable 
	  // .equals() -- refers content 
	  
	  System.out.println(s1==s2); // true 
	  System.out.println(s1==s3);  // false 
	  
	  System.out.println(s1.equals(s3));  // true 
	  System.out.println(s1.equals(s2));  // true 
	  
	  System.out.println("hello"=="hello");  // true -- both are created in string pool  
	  System.out.println("hello"==new String("hello"));  // false -- first is created  in string pool  
	    // second new String("hello") is created in outside string pool
	  System.out.println("hello".equals(new String("hello"))); 
	}
}	