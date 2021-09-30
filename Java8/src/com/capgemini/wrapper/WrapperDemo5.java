package com.capgemini.wrapper;

public class WrapperDemo5 {

	public static void main(String[] args) {
		int p=123;
		
	String s1=	Integer.toString(p);
	String s2=	Integer.toBinaryString(p);
	String s3=	Integer.toHexString(p);
	String s4=	Integer.toOctalString(p);

	System.out.println("decimal "+s1);
	System.out.println("binary "+s2);
	System.out.println("hex"+s3);
	System.out.println("octal"+s4);
	
	

	System.out.println(p+" deciaml value is "+Integer.toString(p,10));
	System.out.println(p+" binary value is "+Integer.toString(p,2));
	System.out.println(p+"hex value is "+Integer.toString(p,16));
	System.out.println(p+" octal value is "+Integer.toString(p,8));
		
	}
}
