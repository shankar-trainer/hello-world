package com.cts.collection;

import java.util.LinkedList;

public class ListDEmo4 {

	public static void main(String[] args) {
		LinkedList<Integer> emp_id=new LinkedList<Integer>();
		
		emp_id.add(6577);
		emp_id.add(6577);
		emp_id.add(6578);
		emp_id.add(6579);
		emp_id.addFirst(6577);
		emp_id.addLast(6577);
		
		System.out.println(emp_id);
		
		emp_id.removeFirst();
		
	}
}
