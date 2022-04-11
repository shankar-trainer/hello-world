package cts.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		
		List<String> citylist=new ArrayList<>();
		
		citylist.add("chennai");
		//citylist.add(67766);
		citylist.add("chennai");
		citylist.add("madurai");
		citylist.add("rameswaram");
		citylist.add("ooty");
		citylist.add("shivkashi");
		citylist.add("chennai");
		citylist.add("madurai");
		citylist.add("chennai");
		
		System.out.println(citylist);
		System.out.println(citylist.contains("banglore"));
		System.out.println(citylist.contains("chennai"));
		
        Collections.sort(citylist);
        System.out.println("sorted city "+citylist);
        int binarySearch = Collections.binarySearch(citylist,"madurai");
        if(binarySearch>=0)
        System.out.println("found at position "+binarySearch);      
        else
        System.out.println("not found ");       
        
        System.out.println("using for loop ");
        for (int i = 0; i <citylist.size(); i++) {
		  System.out.print(citylist.get(i)+", ");	
		}
        
        Iterable i;
        
        System.out.println("using for each ");
        
        for (String s:citylist) {
			System.out.println("\t"+s);
			
		}
        
        Iterator<String> iterator = citylist.iterator();
        
        while(iterator.hasNext()) {
          System.out.println(iterator.next());   	
        }

        
	}
}
