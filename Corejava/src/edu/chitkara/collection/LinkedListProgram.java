package edu.chitkara.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListProgram {

	public static void main(String[] args) {
//		List<Integer> list1=new LinkedList<>();
		LinkedList<Integer> list1 = new LinkedList<>();

		list1.add(11);
		list1.add(22);
		list1.addLast(22);//it adds at last position
		list1.add(33);// it adds at last position

		System.out.println(list1);
		list1.addFirst(44);// add at first position
		list1.addFirst(55);
		System.out.println(list1);
		list1.remove();// removes from head/first
		list1.removeFirst();// removes from head/first

		System.out.println(list1);
		list1.removeLast(); //  removes from last/end
		System.out.println(list1);
	}
}
