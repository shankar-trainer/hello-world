package cts.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// List<Integer> empId_list=new LinkedList<Integer>();
		LinkedList<Integer> empId_list = new LinkedList<Integer>();

		empId_list.add(787887);
		empId_list.add(787888);
		empId_list.add(787889);
		empId_list.add(787886);
		empId_list.add(787885);

		System.out.println(empId_list);

		empId_list.addFirst(999999);

		System.out.println(empId_list);
		empId_list.remove();
		empId_list.removeLast();
		System.out.println(empId_list);

	}
}
