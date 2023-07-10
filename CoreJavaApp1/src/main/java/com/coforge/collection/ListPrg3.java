package com.coforge.collection;

import java.util.LinkedList;

public class ListPrg3 {
public static void main(String[] args) {

	LinkedList<String> languageList=new LinkedList<>();
	languageList.add("java");//add method add at end position
	languageList.add("python");
	languageList.add("javascript");
	languageList.add("python");
	System.out.println(languageList);
	languageList.addFirst("servlet");
	System.out.println(languageList);
	languageList.remove();// remove from head/first
	languageList.removeLast();
	System.out.println(languageList);
}
}
