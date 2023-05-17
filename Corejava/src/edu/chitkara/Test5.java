package edu.chitkara;

public class Test5 {

	public static void main(String[] args) {
		String s = "hello";
		String s1 = "hello";
		String s2 =new String("hello");
		
		System.out.println(s==s1);  // == works if same reference
		System.out.println(s==s2);
		System.out.println(s.equals(s2));
		
		StringBuffer buffer1=new StringBuffer("hi");
		StringBuffer buffer2=new StringBuffer("hi");
	
		System.out.println(buffer2==buffer1);
		System.out.println(buffer2.equals(buffer1));
	}
}
