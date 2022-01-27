package edu.lpu.collection;

import java.util.ArrayList;
import java.util.Collections;

public class GenericProgram1 {

	public static void main(String[] args) {
		ArrayList<String> citylist=new ArrayList<>();
		
		//citylist.add(1223);
		citylist.add("delhi");
		citylist.add("chennai");
		citylist.add("bombay");
		citylist.add("ahmadabad");
		citylist.add("bombay");
		citylist.add("chennai");
		citylist.add("delhi");
		citylist.add("ooty");
		citylist.add("bombay");
		
		System.out.println(" unsorted  ");
		System.out.println(citylist);
		Collections.sort(citylist);
		System.out.println("sorted  ");
		System.out.println(citylist);
		
		System.out.println("first element "+Collections.min(citylist));
		System.out.println("last element "+Collections.max(citylist));
		System.out.println("chennai frequency "+Collections.frequency(citylist, "chennai"));
		System.out.println("bombay frequency "+Collections.frequency(citylist, "bombay"));
		System.out.println("ooty frequency "+Collections.frequency(citylist, "ooty"));
		System.out.println("delhi frequency "+Collections.frequency(citylist, "delhi"));
		
		
	    int pos=Collections.binarySearch(citylist, "delhi");
	    
	    if(pos>=0)
	    	System.out.println("found at "+pos);
	    else 
	    	System.out.println("not found");
	    
	}
}
