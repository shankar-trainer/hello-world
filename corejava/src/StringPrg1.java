class StringPrg1{
  public static void main(String args[]){
	  
	  String s="hello"; // refers object1 
	  
	  System.out.println(s);
	  System.out.println(s.length());
	  System.out.println(s.toUpperCase());
	  String s1=s.toUpperCase(); 
	  
	  System.out.println(s);
	  System.out.println(s1);
	  
	  s.concat("world");   // refers object1
	  System.out.println(s);
	   s= s.concat("world");   // create  object2
	  System.out.println(s);
	  
	  
  }
}