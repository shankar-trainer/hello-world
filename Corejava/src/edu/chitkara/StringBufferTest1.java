package edu.chitkara;

public class StringBufferTest1 {

	public static void main(String[] args) {

		String s = "hello";
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "hello";
		s.concat("world");  // String is immutable 
		System.out.println(s);
		s.replace('h', 'p');
		System.out.println(s);
		

//StringBuffer buffer="hello"; // will not work
		 // synchronized or single threaded  jdk1.0
		StringBuffer buffer = new StringBuffer("hello");
		System.out.println(buffer);
		buffer.append("world");
		System.out.println(buffer);
		
		StringBuilder builder=new StringBuilder("hi"); 
		 // jdk1.5
         // multi threaded   unsynchronized 
	}
}
