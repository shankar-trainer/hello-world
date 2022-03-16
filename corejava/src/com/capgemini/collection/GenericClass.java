package com.capgemini.collection;

public class GenericClass<A,B> {
 private A a;
 private B b;

 public GenericClass(A a, B b) {
	super();
	this.a = a;
	this.b = b;
}
 
 void disp() {
	 System.out.println(a+"  "+b);
 }
 
 public static void main(String[] args) {
	
	 GenericClass<Integer,Integer> class1=new GenericClass<Integer,Integer>(10,12);
	 GenericClass<String,String> class2=new GenericClass<String,String>("hello","world");
	 
	 class1.disp();
	 class2.disp();
	 
}
 
 
 
}
