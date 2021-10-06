package com.capegemini.collection;

import java.util.Arrays;
import java.util.Comparator;

class ConsumerSortById implements Comparator<Consumer>{

	@Override
	public int compare(Consumer o1, Consumer o2) {
	    if(o1.getId()>o2.getId())
		return 1;
	    if(o1.getId()<o2.getId())
			return -1;
	    else
	    	return 0;
	}
}

class ConsumerSortBySalary implements Comparator<Consumer>{

	@Override
	public int compare(Consumer o1, Consumer o2) {
	    if(o1.getSalary()>o2.getSalary())
		return 1;
	    if(o1.getSalary()<o2.getSalary())
			return -1;
	    else
	    	return 0;
	}
}

public class ConsumerSorting {
	public static void main(String[] args) {
		Consumer consumer[]=new Consumer[3];
		consumer[0]=new Consumer(889, "p kumar", "noida", "a_ssn1001", 12000);
		consumer[1]=new Consumer(180, "a kumar", "gurgaon", "p_sn1002", 9000);
		consumer[2]=new Consumer(109, "kamal  kumar", "faridabaad", "c_ssn1009", 11000);
		
		Arrays.sort(consumer, new ConsumerSortById());
		
		System.out.println("sorting by id ");
		
		for (Consumer consumer2 : consumer) {
			System.out.println(consumer2);
		}
	
Arrays.sort(consumer, new ConsumerSortBySalary());
		
		System.out.println("sorting by salary ");
		
		for (Consumer consumer2 : consumer) {
			System.out.println(consumer2);
		}
		
		
	}
}
