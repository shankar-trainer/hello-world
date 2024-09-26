package test;

public class test1{
	
	//private    // it will compile but will not run 
	
	 //static public  void main(String[] args){
	 //static public  void main(String ...bc){
	 static public  void main(){
		 	
		 System.out.println("hello");
	}

	 static public  void main(String args[]){
		 System.out.println("main method");
	  main();
	 }
	
}

class test2{
	public static void main(String[] args) {
		//test1 test=new test();
		//System.out.println(args[0]);
		 test1.main(args);
	}
}


//public 
//abstract 
 //final 
 //static  -- not allowed 
 class c{
	
}