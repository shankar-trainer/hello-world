package com.audintel.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class ListIteratorExample {

	public static void main(String[] args) {
		
		 List<String>  empList=new ArrayList<>();
 
		   empList.add("sharvan sharma");
		   empList.add("amit varma");
		   empList.add("sumant  sharma");
		   empList.add("veerseh kumar");
		   empList.add("devendrea kumar");
		   empList.add("amitendra sinha");
		   
		   //ListIterator<String> listIterator = empList.listIterator();
		   ListIterator<String> iterator = empList.listIterator();  
		   System.out.println("========top to bottom ===============\n");
		   
		   for (;iterator.hasNext();) {
				String string = (String) iterator.next();
				System.out.println(string);
			}
		
		   System.out.println("========= bottom  to top==============\n");
		    
		    while(iterator.hasPrevious()) 
		    	System.out.println(iterator.previous());
				
		  Object[] array = empList.toArray();    
		 
		}
	
}
