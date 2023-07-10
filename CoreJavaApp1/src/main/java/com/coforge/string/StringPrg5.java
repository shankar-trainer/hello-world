package com.coforge.string;

public class StringPrg5 {

	public static void main(String[] args) {
		String var="we are learning java. java is in high demand";
		
		System.out.println(var.indexOf("java"));
		System.out.println(var.lastIndexOf("java"));
		
		String replace = var.replace('e', 'z');
		System.out.println(replace);
		
		System.out.println(var.replaceAll("java", "python"));
		
		System.out.println(var.contains("are"));
		
		String var2=" hello world ";
		System.out.println(var2.length());
		String trim = var2.trim();
		System.out.println(var2);
		System.out.println(trim);
		System.out.println(trim.length());
	}
}
